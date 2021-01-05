package com.coursecube.rabbitmq;

import org.springframework.amqp.core.*; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.Bean; 

@SpringBootApplication 
public class JLCBeanConfig { 
	
	public static final String Hello_EXCHANGE= "myhello-exchange"; 
	public static final String Hello_QUEUE= "myhello-queue"; 


	@Bean(name="myhelloExchage") 
	Exchange createHelloExchange() { 
		return ExchangeBuilder.topicExchange(Hello_EXCHANGE).build(); 
	}
	
	@Bean(name="myhelloQueue") 
	Queue createHelloQueue() { 
		return QueueBuilder.durable(Hello_QUEUE).build(); 
	} 
	
	@Bean 
	Binding helloBinding(Queue myhelloQueue, TopicExchange myhelloExchage) { 
		return BindingBuilder.bind(myhelloQueue) 
				.to(myhelloExchage) 
				.with(Hello_QUEUE); 
	} 

	public static final String Order_EXCHANGE= "myorder-exchange"; 
	public static final String Order_QUEUE= "myorder-queue"; 

	@Bean(name="myorderExchage") 
	Exchange createOrderExchange() { 
		return ExchangeBuilder.topicExchange(Order_EXCHANGE).build(); 
	} 
	@Bean(name="myorderQueue") 
	Queue createOrderQueue() { 
		return QueueBuilder.durable(Order_QUEUE).build(); 
	} 
	@Bean 
	Binding orderBinding(Queue myorderQueue, TopicExchange myorderExchage) { 
		return BindingBuilder.bind(myorderQueue) 
				.to(myorderExchage) 
				.with(Order_QUEUE); //R.K 
	} 
}