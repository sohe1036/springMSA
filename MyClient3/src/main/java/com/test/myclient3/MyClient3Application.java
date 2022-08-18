package com.test.myclient3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.myclient3.MyClient3Application;
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MyClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(MyClient3Application.class, args);
	}
	
	@RequestMapping(value="/")
	public String hello() {
		return "Eureka Client3 Application";
	}
}
