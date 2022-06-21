package com.dev.structure.employee;

import com.dev.rabbitmq.RabbitMQConfig;
import com.dev.rabbitmq.dto.EmployeeDTO;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
// The Receiver is a POJO that defines a method for receiving messages
public class Employee {
    
    @RabbitListener(queues = RabbitMQConfig.QUEUE_EMPLOYEE)
    private void getEmployee(String message) {

        // Imagine a get from database
        EmployeeDTO employeeDTO = new EmployeeDTO();
        System.out.println(employeeDTO);

    }

}
