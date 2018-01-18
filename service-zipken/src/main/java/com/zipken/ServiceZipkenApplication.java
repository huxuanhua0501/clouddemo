package com.zipken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServiceZipkenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZipkenApplication.class, args);
	}
}
