package ru.shatrov.springtelegrammongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigInteger;

/**
 * author Shatrov create date 19.12.2020
 */
@Document(collection = "chat_message")
@Getter
@Setter
public class ChatMessage {

    @MongoId()
    private ObjectId id;
    private String audio;
    private String caption;
    @Field(name = "caption_entities")
    private String captionEntities;
    private BigInteger date;
    private String document;
    private String entities;
    private String game;
    private String location;
    @Field(name = "message_id")
    private BigInteger messageId;
    private String photo;
    @Field(name = "reply_markup")
    private String replyMarkup;
    private String sticker;
    private String text;
    private String video;
    private Chat chat;
    private TelegramUser from;
}
