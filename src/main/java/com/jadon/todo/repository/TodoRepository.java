package com.jadon.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jadon.todo.model.Todo;

// Just using extends JpaRepository gives access to necessary DB functionality
public interface TodoRepository extends JpaRepository<Todo, Long> {
}