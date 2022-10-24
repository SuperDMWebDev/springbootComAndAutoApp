package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Bean;

public class MySqlConnector extends DatabaseConnector{
    @Override
    public void connect()
    {
        System.out.println("Connect to MySql "+ getUrl());
    }
}
