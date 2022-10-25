package com.example.springbootComAndAuto.model;

import antlr.StringUtils;

import java.util.Optional;

// use for check if object is valid
public class TodoValidator {

    //todo( title, detail) must differ to null;
    public boolean isValid(Todo todo)
    {
        return todo.getTitle()!="" && todo.getTitle()!=null;
    }
}
