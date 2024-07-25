package ru.kekco.micro.demo.testclientcardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class TestClientCardServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestClientCardServiceApplication.class, args);
    }

}
