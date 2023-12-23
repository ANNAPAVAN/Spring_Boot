package com.pavan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App02StsApplication {

	public static void main(String[] args) {
		SpringApplication.run(App02StsApplication.class, args);
		System.out.println("******** Welcome to Spring Boot Appication with STS ********"); //   http://localhost:2222/hello
	}

}
