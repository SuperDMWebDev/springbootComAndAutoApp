package com.example.springbootComAndAuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

// springbootapplication to indicate which is main function
@SpringBootApplication
public class SpringBootComAndAutoApplication {

	public static void main(String[] args) {
		System.out.println("Start spring app");
//		SpringApplication.run(SpringBootComAndAutoApplication.class, args);
		//create applicationContext to container all dependency class or bean
		ApplicationContext context=SpringApplication.run(SpringBootComAndAutoApplication.class,args);
		Outfit outfit = context.getBean(Outfit.class);

		System.out.println("Instance: "+outfit);

		outfit.wear();

		Girl girl = context.getBean(Girl.class);

		System.out.println("Girl instance" + girl);

		System.out.println("Girl outfit" + girl.outfit);

		System.out.println("before destroy bean");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
		System.out.println("after destory bean");


	}

}
