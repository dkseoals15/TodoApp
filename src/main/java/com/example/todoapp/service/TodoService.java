package com.example.todoapp.service;

import com.example.todoapp.model.Todo;

import java.util.List;

public interface TodoService {

    void createTodo(String title, String description);

    List<Todo> getAllTodos();

    Todo getTodoById(Long id);

}
