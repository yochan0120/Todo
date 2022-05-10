package com.example.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
