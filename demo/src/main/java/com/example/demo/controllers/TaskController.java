package com.example.demo.controllers;

import com.example.demo.entities.Task;
import com.example.demo.services.I_TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private I_TaskService service;

    @GetMapping("/api/tasks")
    public List<Task> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/tasks/{id}")
    public Task getById(@PathVariable String id){
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/tasks/{id}")
    public void remove(@PathVariable String id){
        service.remove(Integer.parseInt(id));
    }

    @PostMapping("/api/tasks")
    public void save (@RequestBody Task task){
        service.save(task);
    }
}