package com.example.springbootComAndAuto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {


    @GetMapping("/profile")
    public String profile(Model model)
    {
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname","Pham Duy Minh"));
        profile.add(new Info("email","hadtnt71@gmail.com"));

        model.addAttribute("profile",profile);
        return "profile";
    }
    @GetMapping("/")
    public String index()
    {
        System.out.println("index");
        return "index";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam (name="name",required=false,defaultValue = "") String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
    @GetMapping("/about")
    public String about()
    {
        return "about";
    }
}
