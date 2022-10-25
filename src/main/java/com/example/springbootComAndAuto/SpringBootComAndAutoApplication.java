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

//		 return entity pass in => return User
		User newUser= new User();
		System.out.println("newUser " + newUser);
//		newUser.setId(0);
		User user = userRepository.save(newUser);
//		int userId = user.getId();
//		System.out.println("user has id "+ user.getId());
//		user.setAgi(1);
//
//		// findById with get to get element
//		User user2 = userRepository.findById(userId).get();
//		System.out.println("User " + user);
//		System.out.println("User2" + user2);
//
//		userRepository.save(user);
	}

}
