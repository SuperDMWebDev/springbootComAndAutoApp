package com.example.springbootComAndAuto;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.module.Configuration;

// springbootapplication to indicate which is main function
// @ComponentScan and @SpringBootApplication(scanBasePackages="com....") use to show which component
//or bean need to scan
@SpringBootApplication
public class SpringBootComAndAutoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootComAndAutoApplication.class, args);
		//create applicationContext to container all dependency class or bean
		ApplicationContext context=SpringApplication.run(SpringBootComAndAutoApplication.class,args);
		// get bean userRepository
		UserRepository userRepository = context.getBean(UserRepository.class);

		// findall userrepostiroy and print it in each line
		userRepository.findAll().forEach(System.out::println);
		System.out.println("Find user with agi between 25 - 30 ");
		userRepository.findAllByAgiBetween(25,30).forEach(System.out::println);


		System.out.println("========================");
		System.out.println("Find User with agi greater than 97");
		userRepository.findAllByAgiGreaterThan(97).forEach(System.out::println);

		System.out.println("=========");
		System.out.println("Find User with atkk =80");
		userRepository.findAllByAtk(80).forEach(System.out::println);

	}

}
