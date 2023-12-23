package com.pavan.app03_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pavan.controller"})
public class App03SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(App03SpringBootApplication.class, args);
		System.out.println("Spring Boot Using Spring Boot Initializr");
	}

}
