package com.coursecube.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

@Service 
public class OrderSender { 
	@Autowired 
	private RabbitTemplate rabbitTemplate; 

	public void sendOrder(Order myorder) { 
		String routingKey= JLCBeanConfig.Order_QUEUE; 
		rabbitTemplate.convertAndSend(routingKey, myorder); 
	} 
}