package com.shrikar.gcp.igateway;

import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway(defaultRequestChannel = "pubSubOutputChannel")
public interface PubSubOutboundGateway {

	void sendToPubSub(String text);
}
