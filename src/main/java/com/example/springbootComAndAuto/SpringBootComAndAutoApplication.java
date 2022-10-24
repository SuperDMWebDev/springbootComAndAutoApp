package com.example.springbootComAndAuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

// springbootapplication to indicate which is main function
@SpringBootApplication
public class SpringBootComAndAutoApplication {

	static int length = 10;
	public static void main(String[] args) {
		System.out.println("Start spring app");
//		SpringApplication.run(SpringBootComAndAutoApplication.class, args);
		//create applicationContext to container all dependency class or bean
		ApplicationContext context=SpringApplication.run(SpringBootComAndAutoApplication.class,args);

		//get bean service
		GirlService girlService = context.getBean(GirlService.class);

		Girl girl = girlService.getRandomGirl(length);

		System.out.println(girl);


	}

}
