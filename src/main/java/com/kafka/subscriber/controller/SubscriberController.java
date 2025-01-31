package com.kafka.subscriber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriberController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping("/message1")
	public String getMessage1() {
		return "Hello World";
	}

}
