package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTestoneApplicationTests {
	final static Logger logger = LoggerFactory.getLogger(DemoTestoneApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("日志输出:"+getClass().getCanonicalName());
		System.out.println("sd");
	}

}
