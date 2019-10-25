package com.company.rsvpedge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RsvpEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsvpEdgeApplication.class, args);
	}

}
