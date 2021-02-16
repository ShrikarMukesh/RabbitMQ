package com.platform.opensource.igateway;

import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface PubsubOutboundGateway {
	
	void sendToPubsub(String text);
}
