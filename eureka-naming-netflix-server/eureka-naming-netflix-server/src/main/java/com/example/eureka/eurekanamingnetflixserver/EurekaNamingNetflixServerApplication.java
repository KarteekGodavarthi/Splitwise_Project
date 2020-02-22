package com.example.eureka.eurekanamingnetflixserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaNamingNetflixServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingNetflixServerApplication.class, args);
	}

}
