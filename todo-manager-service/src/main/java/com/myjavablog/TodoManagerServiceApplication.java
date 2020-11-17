package com.myjavablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TodoManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagerServiceApplication.class, args);
	}

}
