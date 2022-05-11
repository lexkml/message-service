package com.kamelchukov.messageservice.service;

import com.kamelchukov.messageservice.model.dto.response.MessageResponse;
import com.kamelchukov.messageservice.repository.MessageRepository;
import com.kamelchukov.messageservice.transformer.MessageTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MessageService {

    private MessageRepository repository;

    public List<MessageResponse> findAll() {
        var list = new ArrayList<MessageResponse>();
        repository.findAll().forEach(it -> list.add(MessageTransformer.toResponse(it)));

        return list;
    }
}
