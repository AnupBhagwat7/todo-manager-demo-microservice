package com.myjavablog.controller;

import com.myjavablog.pojo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired(required = true)
    private RestTemplate restTemplate;

    @GetMapping("/todos")
    public List<Todo> getTodosforReport() {

        String url = "http://todo-manager/todos";
        //return restTemplate.getForTodo(url, Todo.class);

        ResponseEntity<Todo[]> responseEntity = restTemplate.getForEntity(url, Todo[].class);
        Todo[] todos = responseEntity.getBody();
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
        return Arrays.asList(todos);
    }
}
