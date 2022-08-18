package com.test.myclient3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@EnableEurekaClient
@RestController
class MyClient3ApplicationTests {

	@Test
	void contextLoads() {
	}

}
