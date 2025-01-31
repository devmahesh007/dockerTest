package com.kafka.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberApplication {

	public static void main(String[] args) {
		System.out.println("Main call ########################");
		SpringApplication.run(SubscriberApplication.class, args);
	}

}
