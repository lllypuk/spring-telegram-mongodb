package ru.shatrov.springtelegrammongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

/**
 * author Shatrov create date 19.12.2020
 */
@Document
@Getter
@Setter
public class Chat {

    @Field(name = "all_members_are_administrators")
    private Boolean allMembersAreAdministrators;
    @MongoId
    private String id;
    private String title;
    private String type;
}
