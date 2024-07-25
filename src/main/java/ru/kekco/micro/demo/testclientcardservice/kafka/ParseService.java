package ru.kekco.micro.demo.testclientcardservice.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.rshbintech.itcorp.backofficebpm.impispz.backend.common.domain.model.dto.cdi.ClientDTO;

import java.util.UUID;

@Slf4j
@Service
public class ParseService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public UUID parseKafkaStringToUuid(String kafkaString) {
        try {
            objectMapper.registerModule(new JavaTimeModule());
            return UUID.fromString(kafkaString);
        } catch (RuntimeException e) {
            log.error("Business exception: {}", e.getMessage());
            throw new RuntimeException();
        }
    }

    public ClientDTO parseKafkaStringToClientDTO(String kafkaString) {
        try {
            objectMapper.registerModule(new JavaTimeModule());
            log.info("parse KafkaString to ClientDTO");
            return objectMapper.readValue(kafkaString, ClientDTO.class);
        } catch (JsonProcessingException e) {
            log.error("Business exception: {}", e.getMessage());
            throw new RuntimeException();
        }
    }
}
