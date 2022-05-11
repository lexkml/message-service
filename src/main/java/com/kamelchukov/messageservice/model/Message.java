package com.kamelchukov.messageservice.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("message")
@Data
@Builder
public class Message {

    @Id
    private Long id;
    private String username;
    private String path;
    private LocalDateTime time;
}
