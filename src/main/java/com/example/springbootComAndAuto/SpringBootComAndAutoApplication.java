package com.example.springbootComAndAuto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.module.Configuration;

// springbootapplication to indicate which is main function
// @ComponentScan and @SpringBootApplication(scanBasePackages="com....") use to show which component
//or bean need to scan
@SpringBootApplication
@EnableConfigurationProperties
public class SpringBootComAndAutoApplication implements CommandLineRunner {
	@Autowired AppProperties appProperties;

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootComAndAutoApplication.class, args);
		//create applicationContext to container all dependency class or bean
		ApplicationContext context=SpringApplication.run(SpringBootComAndAutoApplication.class,args);
	}


	public AppProperties getAppProperties() {
		return appProperties;
	}

	@Override
	public void run(String ...args) throws Exception{
		System.out.println("Global variable:");
		System.out.println("\t Email: "+appProperties.getEmail());

	}


}
