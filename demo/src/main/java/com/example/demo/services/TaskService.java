package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements I_TaskService {

    @Autowired
    private TaskRepository repo;

    @Override
    public List<Task> getAll(){
        return (List<Task>) repo.findAll();
    }

    @Override
    public Task getById(int id){
        return (Task) repo.findById(id).get();
    }

    @Override
    public void remove(int id){
        repo.deleteById(id);
    }

    @Override
    public void save (Task task){
        repo.save(task);
    }

}
