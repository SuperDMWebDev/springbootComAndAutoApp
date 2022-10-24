package com.example.springbootComAndAuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Girl {


   private String name;

   public Girl(String name)
   {
      this.name= name;

   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }




}
