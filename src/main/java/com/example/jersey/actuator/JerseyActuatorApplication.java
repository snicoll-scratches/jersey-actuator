package com.example.jersey.actuator;

import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JerseyActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyActuatorApplication.class, args);
	}

	@Bean
	public ResourceConfig resourceConfig() {
		return new ResourceConfig();
	}
	
}
