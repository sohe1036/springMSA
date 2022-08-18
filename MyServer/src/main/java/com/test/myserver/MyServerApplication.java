package com.test.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//유레카 서버
@SpringBootApplication
@EnableEurekaServer
public class MyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServerApplication.class, args);
	}

}
