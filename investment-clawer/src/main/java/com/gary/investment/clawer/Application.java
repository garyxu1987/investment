package com.gary.investment.clawer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan
@RestController
@EnableEurekaClient
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}

	@RequestMapping("/abc")
	public String abc() {
		return "Hello World abc!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}