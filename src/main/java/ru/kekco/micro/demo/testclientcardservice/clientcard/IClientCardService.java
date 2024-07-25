package ru.kekco.micro.demo.testclientcardservice.clientcard;

import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

public interface IClientCardService {
    ClientDTO getClientDto(String clientIdentityId);
}
