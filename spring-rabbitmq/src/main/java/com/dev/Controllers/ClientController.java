package com.dev.Controllers;

import com.dev.rabbitmq.RabbitMQConfig;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.dev.rabbitmq.RabbitMqService;

@RestController
@RequestMapping("/api-v1")
public class ClientController {

    private final RabbitMqService rabbitMqService;
    
    public ClientController(
        RabbitMqService rabbitMqService
    ) {
        this.rabbitMqService = rabbitMqService;
    }

    @GetMapping("/client")
    public ResponseEntity<?> getClient(@RequestBody String consumerId) {
        
        this.rabbitMqService.sendMessage(RabbitMQConfig.QUEUE_CONSUMER, consumerId);
        return ResponseEntity.ok("{}");

    }
}
