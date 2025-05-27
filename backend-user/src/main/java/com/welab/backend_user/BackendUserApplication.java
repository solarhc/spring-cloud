package com.welab.backend_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BackendUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendUserApplication.class, args);
	}
}
