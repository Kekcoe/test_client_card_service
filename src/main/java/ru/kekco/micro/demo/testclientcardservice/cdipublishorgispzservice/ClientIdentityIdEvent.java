package ru.kekco.micro.demo.testclientcardservice.cdipublishorgispzservice;

import lombok.Getter;

@Getter
public class ClientIdentityIdEvent {
    private final String clientIdentityId;

    public ClientIdentityIdEvent(String clientIdentityId) {
        this.clientIdentityId= clientIdentityId;
    }
}
