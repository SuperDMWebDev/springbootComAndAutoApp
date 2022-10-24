package com.example.springbootComAndAuto;

public class MySqlConnector extends DatabaseConnector{
    @Override
    public void connect()
    {
        System.out.println("Connect to MySql "+ getUrl());
    }
}
