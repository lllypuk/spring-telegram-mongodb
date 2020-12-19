package ru.shatrov.springtelegrammongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigInteger;

/**
 * author Shatrov create date 19.12.2020
 */
@Document
@Getter
@Setter
public class TelegramUser {

    private Boolean bot;
    @Field(name = "first_name")
    private String firstName;
    @MongoId
    private BigInteger id;
    @Field(name = "is_bot")
    private Boolean isBot;
    @Field(name = "last_name")
    private String lastName;
    private String username;
}
