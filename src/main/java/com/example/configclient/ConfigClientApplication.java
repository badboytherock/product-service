package com.example.configclient;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@SpringBootApplication
public class ConfigClientApplication {

	@Value("${spring.messages.HELLO_MESSAGE: Default hello}")
	private String message;
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){

		return message;
	}
}
