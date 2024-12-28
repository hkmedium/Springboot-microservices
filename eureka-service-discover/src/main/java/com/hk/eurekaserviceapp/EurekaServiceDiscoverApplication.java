package com.hk.eurekaserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//http://localhost:8291/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDiscoverApplication.class, args);
	}

}
