package com.dev.rabbitmq;

// A class to set up the Queues RabbitMq
public class RabbitMQConfig {
    
	public static final String QUEUE_CONSUMER = "CONSUMER";
	public static final String QUEUE_EMPLOYEE = "EMPLOYEE";

	/*
		TODO
	static final String topicExchangeName = "spring-boot-exchange";

	@Bean
	Queue queue() {
		return new Queue(queueName, false);
	}

	// Bridge between the Publisher and the Consumer
	@Bean
	TopicExchange exchange() {
		return new TopicExchange(topicExchangeName);
	}

	// Passing the messagem
	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
	}

	@Bean
	SimpleMessageListenerContainer container(
		ConnectionFactory connectionFactory, 
		MessageListenerAdapter listenerAdapter
	) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(queueName);
		container.setMessageListener(listenerAdapter);

		return container;
	}

	// Consumer - listening the message
	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
	  return new MessageListenerAdapter(receiver, "receiveMessage");
	}*/

}
