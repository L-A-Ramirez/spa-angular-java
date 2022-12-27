package com.example.demo.services;

import com.example.demo.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface I_TaskService {
     List<Task> getAll();
     Task getById(int parseInt);
     void save (Task task);
     void remove(int id);


}
