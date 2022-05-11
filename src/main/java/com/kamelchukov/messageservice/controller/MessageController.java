package com.kamelchukov.messageservice.controller;

import com.kamelchukov.messageservice.model.dto.response.MessageResponse;
import com.kamelchukov.messageservice.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MessageController {

    private MessageService service;

    @GetMapping("/messages")
    public List<MessageResponse> findAll() {
        return service.findAll();
    }
}
