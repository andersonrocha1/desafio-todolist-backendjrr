package com.andersondev.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.desafiotodolist.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
