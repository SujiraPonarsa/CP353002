package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example") //service, controller, model
//@ComponentScan(basePackages={"com.example.services","com.example.controller","com.example.model"}
public class Lab06Sec4Autowired1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab06Sec4Autowired1Application.class, args);
	}

}
