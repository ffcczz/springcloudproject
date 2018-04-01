package com.springcloud.sconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SconfigApplication {
	/**
	*bug2 for fork
	*/
	private String bug2fork1;

	/**
	*bug2 for local fork
	*/
	private String bug2forlocal;

	/**
	*master2 修改提交
	*/
	private String master2;


	/**
	*master 提交
	*/
	private String master;



	public static void main(String[] args) {
		SpringApplication.run(SconfigApplication.class, args);
	}
}
