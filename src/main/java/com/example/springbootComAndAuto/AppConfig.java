package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;

@Configuration
public class AppConfig {


    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:33060/loda");
        // Set username, password, format, v.v...
        return mySqlConnector;
    }

    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017/loda");
        // Set username, password, format, v.v...
        return mongoDbConnector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure(){
        DatabaseConnector postgreSqlConnector = new PostgresSqlConnector();
        postgreSqlConnector.setUrl("postgresql://localhost/loda");
        // Set username, password, format, v.v...
        return postgreSqlConnector;
    }

    @Bean
    SimpleBean simpleBeanConfigure()
    {
        return new SimpleBean("minh");
    }
}
