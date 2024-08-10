package com.wimg.sparepart.order.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {
    // create kafka value
    @Value("${spring.kafka.template.default-topic}")
    private String topiName ;
    // create new topic
    @Bean
    public NewTopic createTopic(){
        return TopicBuilder.name(topiName).partitions(1).replicas(1).build();
    }
}
