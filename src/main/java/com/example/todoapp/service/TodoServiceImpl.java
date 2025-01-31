package com.example.todoapp.service;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;

import java.util.List;

public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void createTodo(String title, String description) {
        Todo todo = new Todo(null, title, description);
        todoRepository.save(todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.getAllTodos();
    }

    @Override
    public Todo getTodoById(Long id) {
        Todo todo = todoRepository.findTodoById(id);
        if (todo == null) {
            throw new RuntimeException("Todo not found!");
        }
        return todo;
    }

}
