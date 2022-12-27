package com.example.demo.repository;

import com.example.demo.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository <Task, Integer> {
}
