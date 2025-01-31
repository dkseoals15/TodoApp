package com.example.todoapp.repository;

import com.example.todoapp.model.Todo;

import java.util.List;

public interface TodoRepository {
    //저장
    void save(Todo todo);

    // 모든 todo 리스트 가져오기
    List<Todo> getAllTodos();
    // 특정 id의 todo 찾기
    Todo findTodoById(Long id);


}
