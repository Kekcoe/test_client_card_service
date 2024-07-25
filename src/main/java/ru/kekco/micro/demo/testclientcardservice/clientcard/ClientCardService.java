package ru.kekco.micro.demo.testclientcardservice.clientcard;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class ClientCardService implements IClientCardService{

    @Override
    public ClientDTO getClientDto(String clientIdentityId) {
        log.info("Start of creating ClientCard");
        UUID clientCardUid = UUID.fromString(clientIdentityId) ;
        UUID clientIdentityUid = UUID.fromString(clientIdentityId);
        String inn = "9704010347";
        String clientType= "1";
        Boolean isArchive = false ;
        String shortName = "ООО \"ГУДСЕРВИС\"";
        String fullName = "ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \"ГУДСЕРВИС\"";
        Boolean isResident = true;
        String kpp = "770401012";
        String ogrn ="1207700021211";
        LocalDateTime updDate = LocalDateTime.now();
        String xRef = "44";
        String idCdi = "330179349";
        String idCdi2="23";
        BigDecimal usa= BigDecimal.valueOf(124124.23423);
        String legalAddress = "РОССИЯ,119048,,,г.Москва,,ул Лужники,дом 24,,строение 40,КОМНАТА 3";
        String currentAddress = "РОССИЯ,119048,,,г.Москва,,ул Лужники,дом 24,,строение 40,КОМНАТА 3";
        LocalDateTime archivedDate = null;
        LocalDateTime createdDate = LocalDateTime.now();
        ClientDTO clientDTO = new ClientDTO(clientCardUid,clientIdentityUid,inn,clientType,isArchive,shortName,fullName,
        isResident,kpp,ogrn,updDate,xRef, idCdi,idCdi2,usa,legalAddress,currentAddress,archivedDate,createdDate);
        return clientDTO;
    }
}
