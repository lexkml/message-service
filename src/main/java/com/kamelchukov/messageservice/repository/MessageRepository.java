package com.kamelchukov.messageservice.repository;

import com.kamelchukov.messageservice.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
