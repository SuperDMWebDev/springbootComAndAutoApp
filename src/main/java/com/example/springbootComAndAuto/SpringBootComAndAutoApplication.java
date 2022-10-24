package com.example.springbootComAndAuto;

import com.example.springbootComAndAuto.others.OtherGirl;
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
@SpringBootApplication(scanBasePackages = "com.example.springbootComAndAuto.others")
//@ComponentScan("com.example.springbootComAndAuto.others") // choose component for scan
public class SpringBootComAndAutoApplication {

	static int length = 10;
	public static void main(String[] args) {
		System.out.println("Start spring app");
//		SpringApplication.run(SpringBootComAndAutoApplication.class, args);
		//create applicationContext to container all dependency class or bean
		ApplicationContext context=SpringApplication.run(SpringBootComAndAutoApplication.class,args);
		Girl girl = null;
		try {
			girl = context.getBean(Girl.class);
			System.out.println("Bean " + girl.toString());
		} catch (BeansException e) {
				System.out.println("Bean girl not exist "+ e);
		}

		try {
			OtherGirl otherGirl = context.getBean(OtherGirl.class);
			System.out.println("Bean "+otherGirl.toString());
		} catch (BeansException e) {
			throw new RuntimeException(e);
		}

	}

}
