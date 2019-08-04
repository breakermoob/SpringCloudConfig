package com.microservicios2.clase2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerClase2Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerClase2Application.class, args);
	}

}
