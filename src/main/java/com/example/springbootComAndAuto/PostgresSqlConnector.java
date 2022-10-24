package com.example.springbootComAndAuto;

public class PostgresSqlConnector extends DatabaseConnector{
    @Override
    public void connect()
    {
        System.out.println("Connect to postgresSql "+ getUrl());
    }
}
