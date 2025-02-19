package com.nicolas.tp_spring_task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.tp_spring_task.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
