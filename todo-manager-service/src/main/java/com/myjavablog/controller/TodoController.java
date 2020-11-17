package com.myjavablog.controller;

import com.myjavablog.pojo.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    static List<Todo> todos = new ArrayList<Todo>();
    static{
        Todo t1 = new Todo(1,"Gym", "gym at 6am", "pending");
        Todo t2 = new Todo(1,"Gym", "gym at 6am", "pending");
        Todo t3 = new Todo(1,"Gym", "gym at 6am", "pending");
        Todo t4 = new Todo(1,"Gym", "gym at 6am", "pending");
        Todo t5 = new Todo(1,"Gym", "gym at 6am", "pending");
        todos.add(t1);todos.add(t2);todos.add(t3);todos.add(t4);todos.add(t5);
    }


    @GetMapping("/todos")
    public List<Todo> getTodoList() {

        return todos;
    }
}


