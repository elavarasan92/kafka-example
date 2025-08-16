package com.elavarasan.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${elavarasan.topic.name}")
    private String topicName;

    public NewTopic elavarasanTopic(){
        return TopicBuilder.name(topicName).build();
    }
}
