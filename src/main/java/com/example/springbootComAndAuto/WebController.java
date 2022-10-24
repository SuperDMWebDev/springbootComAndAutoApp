package com.example.springbootComAndAuto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class WebController {
    List<Todo> todoList = new CopyOnWriteArrayList<>();

    @RequestMapping(value="/listTodo",method= RequestMethod.GET)
    public String listTodo(@RequestParam(value="limit",required = false) Integer limit,Model model)
    {
        System.out.println("limit " + limit);

        model.addAttribute("todoList",limit!=null?todoList.subList(0,limit):todoList);
        return "listTodo";
    }


}
