package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bikini")
@Scope("prototype") // tao 1 bean moi moi lan truy cap (@Primary > @Scope)gi
public class Bikini implements  Outfit{

    @Override
    public void wear()
    {
        System.out.println("Bikini");
    }
}
