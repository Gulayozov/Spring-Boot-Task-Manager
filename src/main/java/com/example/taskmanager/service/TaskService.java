package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {
    private final Map<Long, Task> taskRepository = new HashMap<>();
    private Long nextId = 1L;

    public Task addTask(Task task) {
        task.setId(nextId++);
        taskRepository.put(task.getId(), task);
        return task;
    }

    public Map<Long, Task> getAllTasks() {
        return taskRepository;
    }

    public void deleteTask(Long id) {
        taskRepository.remove(id);
    }
}
