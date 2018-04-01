package com.register.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaServer
public class RegistercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistercenterApplication.class, args);
	}
}
