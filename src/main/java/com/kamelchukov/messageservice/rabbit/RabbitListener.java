package com.kamelchukov.messageservice.rabbit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kamelchukov.common.model.dto.messageDto.MessageDto;
import com.kamelchukov.messageservice.repository.MessageRepository;
import com.kamelchukov.messageservice.transformer.MessageTransformer;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@AllArgsConstructor
public class RabbitListener {

    private ObjectMapper mapper;
    private MessageRepository repository;
    private final Logger logger = LoggerFactory.getLogger(RabbitListener.class);

    @SneakyThrows
    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receive(String msg) {
        logger.info("Receive message: " + msg);
        var messageDto = mapper.readValue(msg, MessageDto.class);
        logger.info("Converting message to MessageDto was successful: " + messageDto);
        var message = MessageTransformer.toMessage(messageDto);
        logger.info("Converting MessageDto to Message was successful: " + message);
        repository.save(message);
        logger.info("Saving Message to database was successful");
    }
}
