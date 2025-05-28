package com.welab.backend_alim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BackendAlimApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAlimApplication.class, args);
	}

}
