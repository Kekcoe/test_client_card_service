package ru.kekco.micro.demo.testclientcardservice.cdipublishorgispzservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

@Getter
@AllArgsConstructor
public class UpdatedClientDTOReceivingEvent {
    private final ClientDTO clientDTO;
}
