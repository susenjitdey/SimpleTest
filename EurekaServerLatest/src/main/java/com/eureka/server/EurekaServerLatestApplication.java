package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerLatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerLatestApplication.class, args);
	}

}
