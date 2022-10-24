package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // tao 1 bean moi moi lan truy cap
public class Bikini implements  Outfit{

    @Override
    public void wear()
    {
        System.out.println("Bikini");
    }
}
