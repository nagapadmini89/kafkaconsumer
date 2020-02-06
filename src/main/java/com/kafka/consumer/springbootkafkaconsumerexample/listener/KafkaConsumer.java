package com.kafka.consumer.springbootkafkaconsumerexample.listener;

import com.kafka.consumer.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_Example", groupId = "group_id")
    public void consumer(String message){
        System.out.println("Consumed message: "+ message);
    }

    @KafkaListener(topics = "Kafka_Example_json",groupId = "group_json",
    containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("Consumer Json message: " +user);
    }
}
