package com.elavarasan.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "ElavarasanTopic", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "+data +" tada");
    }
}
