package com.example.springbootComAndAuto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;

@Configuration
public class AppConfig {

    @Value("${mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mysqlConfigure()
    {
        DatabaseConnector connector = new MySqlConnector();
        System.out.println("mysql url "+mysqlUrl);
        connector.setUrl(mysqlUrl);
        return connector;
    }
}
