package com.example.taskmanager.model;

public class Task {
    private long id;
    private String name;
    private boolean completed;

    // Constructor
    public Task(long id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    // Getter and Setter methods
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
