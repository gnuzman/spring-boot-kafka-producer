package com.zzh.kafka.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


    @GetMapping("sendMessage")
    public void sendMessage() {

    }
}
