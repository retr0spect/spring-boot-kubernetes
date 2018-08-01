package com.retrospect.orderapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloSpring() {
		return "Hello Spring Boot from Order Service";
	}
}
