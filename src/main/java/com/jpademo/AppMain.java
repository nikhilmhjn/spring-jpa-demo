package com.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class AppMain extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
}
