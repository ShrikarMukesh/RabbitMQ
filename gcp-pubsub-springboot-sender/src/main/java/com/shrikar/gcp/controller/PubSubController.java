package com.shrikar.gcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.shrikar.gcp.igateway.PubSubOutboundGateway;

@RestController
public class PubSubController {

	@Autowired
	private PubSubOutboundGateway messagingGateway;

	@PostMapping("/publishMessage")
	public RedirectView publishMessage(@RequestParam("message") String message) {
		messagingGateway.sendToPubSub(message);
		return new RedirectView("/thanks");
	}
}
