package ru.kekco.micro.demo.testclientcardservice.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaSender {

    private static KafkaTemplate<String, String> kafkaTemplate;
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public KafkaSender(KafkaTemplate<String, String> kafkaTemplate, ApplicationEventPublisher eventPublisher) {
        KafkaSender.kafkaTemplate = kafkaTemplate;
        this.eventPublisher = eventPublisher;
    }

    public static boolean sendMessage(TopicNames topicName, String message) {
        try {
            kafkaTemplate.send(topicName.getName(), message);
            return true;
        } catch (RuntimeException e) {
            log.error("Ошибка отправки сообщения -> KAFKA в топик: {} \n сообщение об ошибке:\n {}",
                    topicName.getName(), e.getMessage());
            return false;
        }
    }
}
