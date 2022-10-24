package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Bean;

public abstract class DatabaseConnector {
    private String url;

    public abstract void connect();

    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }
}
