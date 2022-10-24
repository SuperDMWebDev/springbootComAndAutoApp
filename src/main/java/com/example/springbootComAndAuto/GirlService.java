package com.example.springbootComAndAuto;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public String randomName(int length)
    {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
    public Girl getRandomGirl(int length)
    {
        String name = randomName(length);
        System.out.println("name" + name);
        return girlRepository.getGirlByName(name);
    }
}
