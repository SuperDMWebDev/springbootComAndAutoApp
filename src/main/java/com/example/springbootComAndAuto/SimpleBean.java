package com.example.springbootComAndAuto;

public class SimpleBean {
    private String username;

    public SimpleBean(String username)
    {
        this.username=username;
    }

    @Override
    public String toString()
    {
        return "This is a bean " + username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername()
    {
        this.username=username;
    }
}
