package ru.kekco.micro.demo.testclientcardservice.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;
import ru.kekco.micro.demo.testclientcardservice.cdipublishorgispzservice.ClientIdentityIdEvent;
import ru.kekco.micro.demo.testclientcardservice.cdipublishorgispzservice.UpdatedClientDTOReceivingEvent;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumerService {
    private final ParseService parseService;
    private final ApplicationEventPublisher eventPublisher;

    @KafkaListener(topics = "${app.kafka.topic.client-uuid}", groupId = "${app.kafka.topic.group.client}")
    public void listenUuidClientDTO(String message,
                                    @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                                    @Header(KafkaHeaders.RECEIVED_TIMESTAMP) Long timestamp) {
        log.info("Received message: {}", message);
        log.info("Topic: {}", topic);
        log.info("Timestamp: {}", timestamp);
        try {
            UUID clientUuid = parseService.parseKafkaStringToUuid(message);
            eventPublisher.publishEvent(new ClientIdentityIdEvent(clientUuid.toString()));
        } catch (RuntimeException e) {
            log.error("Ошибка в момент считывания!");
        }
    }

    @KafkaListener(topics="${app.kafka.topic.client-rich}", groupId = "${app.kafka.topic.group.client}")
    public void listenUpdatedClientDTO(String message,
                                    @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                                    @Header(KafkaHeaders.RECEIVED_TIMESTAMP) Long timestamp,
                                       Acknowledgment acknowledgment) {
        log.info("Received message: {}", message);
        log.info("Topic: {}", topic);
        log.info("Timestamp: {}", timestamp);
        try{
            ClientDTO clientDTO = parseService.parseKafkaStringToClientDTO(message);
//            eventPublisher.publishEvent(new UpdatedClientDTOReceivingEvent(clientDTO));
            boolean logicForMessageProcessingCompleted = true;
            if (logicForMessageProcessingCompleted) {
                KafkaSender.sendMessage(TopicNames.MESSAGE_ACKNOWLEDGE_TOPIC, "Updated ClientCard successfully saved to database " + clientDTO.getClientIdentityUid());
                acknowledgment.acknowledge();
            }
        }catch(RuntimeException e){
            log.error("Ошибка в момент считывания! {}", e.getMessage());
        }
    }
}
