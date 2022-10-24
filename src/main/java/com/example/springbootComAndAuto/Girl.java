package com.example.springbootComAndAuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Girl {

    @Autowired
    Outfit outfit;

    public Girl(@Qualifier("bikini") Outfit outfit)
    {
        this.outfit = outfit;
    }

    @PostConstruct // call this function after creating bean and manging it
    public void postConstructor()
    {
        System.out.println("Girl instance created");
    }

    @PreDestroy // call this before destroy bean
    public void preDestroy()
    {
        System.out.println("Girl instance destroy");
    }

}
