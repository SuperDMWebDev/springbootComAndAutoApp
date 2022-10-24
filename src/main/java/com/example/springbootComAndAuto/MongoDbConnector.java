package com.example.springbootComAndAuto;

import javax.xml.crypto.Data;

public class MongoDbConnector extends DatabaseConnector {
    @Override
    public void connect()
    {
        System.out.println("Connect to mongodb "+ getUrl());
    }
}
