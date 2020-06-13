package com.atguigu.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootHelloParent01ApplicationTests {

	@Autowired
	private WebMvcAutoConfiguration webMvcAutoConfiguration;

//	@Autowired
//	private RabbitAutoConfiguration rabbitAutoConfiguration;

	@Test
	void contextLoads() {
//		System.out.println(webMvcAutoConfiguration);
//		System.out.println(rabbitAutoConfiguration);
		int i = webMvcAutoConfiguration.hiddenHttpMethodFilter().getOrder();
		System.out.println(i);
	}

}
