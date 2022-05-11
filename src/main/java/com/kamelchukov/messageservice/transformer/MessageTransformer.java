package com.kamelchukov.messageservice.transformer;

import com.kamelchukov.common.model.dto.messageDto.MessageDto;
import com.kamelchukov.messageservice.model.Message;
import com.kamelchukov.messageservice.model.dto.response.MessageResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageTransformer {

    public Message toMessage(MessageDto messageDto) {
        return Message.builder()
                .username(messageDto.getUsername())
                .path(messageDto.getPath())
                .time(messageDto.getTime())
                .build();
    }

    public MessageResponse toResponse(Message message) {
        return MessageResponse.builder()
                .id(message.getId())
                .username(message.getUsername())
                .path(message.getPath())
                .time(message.getTime())
                .build();
    }
}
