package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestoneApplication {
	final static Logger LOGGER = LoggerFactory.getLogger(DemoTestoneApplication.class);

	/**
	 * 日志配置练习
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoTestoneApplication.class, args);
		LOGGER.info("123+++");
	}

}
