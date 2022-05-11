package com.kamelchukov.messageservice.model.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class MessageResponse {
    private Long id;
    private String username;
    private String path;
    private LocalDateTime time;
}

