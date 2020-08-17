package com.teksenz.trainingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TrainingEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingEurekaApplication.class, args);
	}

}
