package com.pavan.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pavan.controller"})
public class Test {

	public static void main(String[] args) {
		
		//To run Spring Boot Project
		SpringApplication.run(Test.class, args);
		System.out.println("--Testing Spring Boot Application--");
	}

}
