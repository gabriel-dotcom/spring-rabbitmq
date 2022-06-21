package com.dev.structure.client;

import com.dev.rabbitmq.RabbitMQConfig;
import com.dev.rabbitmq.dto.ClientDTO;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
// The Receiver is a POJO that defines a method for receiving messages
public class Client {
    
    @RabbitListener(queues = RabbitMQConfig.QUEUE_CONSUMER)
    private void getClient(String message) {
        
        // Image a get from database
        ClientDTO client = new ClientDTO();
        System.out.println(client);

    }

}
