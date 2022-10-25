package com.example.springbootComAndAuto;

import org.apache.coyote.Response;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;




//method in header will show which is type of mapping
@RestController
@RequestMapping("/api/v1")
public class RestApiController {
    private List<Todo> todoList = new CopyOnWriteArrayList<>();

    @PostConstruct
    public void init()
    {
        todoList.add(null);
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList()
    {
        return todoList;
    }
    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name="todoId") Integer todoId)
    {
        return todoList.get(todoId);
    }

    @PostMapping("/todo")
    public ResponseEntity addTodo(@RequestBody Todo todo)
    {

        todoList.add(todo);

        return ResponseEntity.status(HttpStatus.CREATED).body(todo);

    }


    @PutMapping("/todo/{todoId}")
    public void editTodo(@PathVariable(name="todoId") Integer todoId, @RequestBody Todo toDo)
    {
        System.out.println("string item " + toDo.toString());

        todoList.set(todoId,toDo);
    }

    @DeleteMapping(value="/todo/{todoId}")
    public ResponseEntity deleteTodo(@PathVariable(name="todoId") Integer todoId)
    {
        System.out.println("todoId " + todoId);
        todoList.remove(todoId.intValue());
        // like ResponseEntity.ok()
        return ResponseEntity.ok().build();
    }










}
