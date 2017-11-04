package com.zzh.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ProducerController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("sendMessage")
    public void sendMessage() {
        System.out.println("gg");
        Random rdn = new Random();

        kafkaTemplate.send("topic-1", "" + rdn.nextInt());
    }
}
