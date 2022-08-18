package com.test.myclient1;
//유레카 클라이언트1
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MyClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyClient1Application.class, args);
	}

	@RequestMapping(value="/")
	public String hello() {
		return "Eureka Client1 Application";
	}
}
