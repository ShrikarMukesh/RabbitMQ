package com.coursecube.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener; 
import org.springframework.stereotype.Service; 

@Service 
public class OrderListener { 

	@RabbitListener(queues = JLCBeanConfig.Order_QUEUE) 

	public void placeOrder(Order myorder) { 
		System.out.println("OrderListener--insertOrder() "); 
		System.out.println("------------------------- "); 
		System.out.println("Order Received: "+myorder); 
		System.out.println("------------------------- "); 
	} 
}
