package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan("com.example.models")
@EnableJpaRepositories("com.example.repositories")
public class AzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
