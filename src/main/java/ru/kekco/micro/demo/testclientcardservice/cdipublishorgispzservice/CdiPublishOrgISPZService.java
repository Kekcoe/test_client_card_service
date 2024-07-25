package ru.kekco.micro.demo.testclientcardservice.cdipublishorgispzservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import ru.kekco.micro.demo.testclientcardservice.clientcard.IClientCardService;
import ru.kekco.micro.demo.testclientcardservice.kafka.KafkaSender;
import ru.kekco.micro.demo.testclientcardservice.kafka.TopicNames;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

@Slf4j
@Service
public class CdiPublishOrgISPZService {

    final IClientCardService clientCardService;
    final KafkaSender kafkaSender;
    final TopicNames TOPIC_CLIENT_CARD = TopicNames.CLIENT_DTO_TOPIC;

    @Autowired
    public CdiPublishOrgISPZService(IClientCardService clientCardService,KafkaSender kafkaSender) {
        this.clientCardService = clientCardService;
        this.kafkaSender = kafkaSender;
    }

    @EventListener
    public void onClientIdentityIdReceived(ClientIdentityIdEvent event){
        String clientIdentityId = event.getClientIdentityId();
        log.info("ClientIdentityId received: {}", clientIdentityId);
        ClientDTO clientDTO = clientCardService.getClientDto(clientIdentityId);
        log.info("ClientDTO instance created");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
            String jsonString = objectMapper.writeValueAsString(clientDTO);
            System.out.println(jsonString);
            KafkaSender.sendMessage(TOPIC_CLIENT_CARD, jsonString);
        } catch (Exception e) {
            log.error("Ошибка отправки сообщения -> KAFKA в топик: {} \n сообщение об ошибке:\n {}",
                    TOPIC_CLIENT_CARD, e.getMessage());
        }
    }

//    @EventListener
//    public void onClientDTOReceived(UpdatedClientDTOReceivingEvent event){
//        ClientDTO receivedClientDTO = event.getClientDTO();
//        log.info("Updated ClientDTOreceived , cuid {}" , receivedClientDTO.getClientCardUid());
//    }
}