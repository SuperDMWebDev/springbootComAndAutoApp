package com.example.springbootComAndAuto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("naked")
@Primary
public class Naked implements Outfit {
        @Override
        public void wear()
        {
            System.out.println("I am naked");
        }
}
