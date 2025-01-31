package com.example.todoapp.repository;

import com.example.todoapp.model.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoRepositoryImpl implements TodoRepository {
    private final Map<Long, Todo> storage = new HashMap<>();
    private Long sequence = 1L;

    @Override
    public void save(Todo todo) {
        todo.setId(sequence++);
        storage.put(todo.getId(), todo);
    }

    @Override
    public List<Todo> getAllTodos() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Todo findTodoById(Long id) {
        return storage.get(id);
    }
}
