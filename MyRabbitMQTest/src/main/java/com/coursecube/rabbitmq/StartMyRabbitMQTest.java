package com.coursecube.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class StartMyRabbitMQTest implements CommandLineRunner{ 

	@Autowired 
	HelloSender helloSender; 

	@Autowired 
	OrderSender orderSender; 

	public static void main(String[] args) { 
		SpringApplication.run(StartMyRabbitMQTest.class, args); 
	} 
	public void run(String... args) throws Exception {
		
		System.out.println("RabbitMQTest Application Launched");

		helloSender.sendHelloMessage("Hello Guys , How are You?");
		System.out.println("Done 1 ");
		
		helloSender.sendHelloMessage("We are Learning RabbitMQ!!!");
		System.out.println("Done 2 ");
		
		System.out.println("---------------------"); 
		Order order=new Order(101, "30-Aug-2020", 99, 5, 2500, "New");
		orderSender.sendOrder(order); 
		System.out.println("Done 3 "); 
	} 
}