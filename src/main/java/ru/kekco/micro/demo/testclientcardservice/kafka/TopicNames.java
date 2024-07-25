package ru.kekco.micro.demo.testclientcardservice.kafka;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TopicNames {

    CLIENT_DTO_TOPIC("CLIENT_DTO_TOPIC","топик храниит обычные DTO с карточками клиента"),
    CLIENT_ENRICH_DTO_TOPIC("CLIENT_ENRICH_DTO_TOPIC","топик храниит обогащенные DTO с карточками клиента"),
    CLIENT_UUID_TOPIC("CLIENT_UUID_TOPIC","топик храниит UUID сопоставимые с карточками клиента"),
    MESSAGE_ACKNOWLEDGE_TOPIC("MESSAGE_ACKNOWLEDGE_TOPIC","топик дял подтвержедния получения сообщения после сохранения " +
            "карточки клиента в базу данных");

    private String name;
    private String description;
}
