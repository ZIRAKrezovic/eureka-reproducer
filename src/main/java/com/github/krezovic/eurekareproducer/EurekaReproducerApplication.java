package com.github.krezovic.eurekareproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaReproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaReproducerApplication.class, args);
	}

}
