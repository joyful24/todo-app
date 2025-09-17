package com.app.todo.app.repository;

import com.app.todo.app.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task,Long>{

}
