package com.example.todoapp.model;

public class Todo {
    private Long id;
    private String title;
    private String description;

    public Todo(Long id, String title, String discription ) {
        this.id = id;
        this.title = title;
        this.description = discription;
    }

    //get
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    //set
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
