package ru.shatrov.springtelegrammongodb.controller;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.shatrov.springtelegrammongodb.entity.ChatMessage;

/**
 * author Shatrov create date 19.12.2020
 */
@RepositoryRestResource(collectionResourceRel = "chat_message", path = "message")
public interface ChatMessageController extends MongoRepository<ChatMessage, ObjectId> {
}
