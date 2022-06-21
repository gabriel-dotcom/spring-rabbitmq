package com.dev.Controllers;

import com.dev.rabbitmq.RabbitMQConfig;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.dev.rabbitmq.RabbitMqService;

@RestController
@RequestMapping("/api-v1")
public class EmployeeController {
    
    private final RabbitMqService rabbitMqService;
    
    public EmployeeController(
        RabbitMqService rabbitMqService
    ) {
        this.rabbitMqService = rabbitMqService;
    }

    @GetMapping("/employee")
    public ResponseEntity<?> getEmployee(@RequestBody String consumerId) {
        
        this.rabbitMqService.sendMessage(RabbitMQConfig.QUEUE_EMPLOYEE, consumerId);
        return ResponseEntity.ok("{}");

    }

}
