package com.example.springbootComAndAuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    @Autowired
    Outfit outfit;

    public Girl(@Qualifier("bikini") Outfit outfit)
    {
        this.outfit = outfit;
    }
}
