package com.andersondev.desafiotodolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersondev.desafiotodolist.model.Todo;
import com.andersondev.desafiotodolist.services.TodoService;

@RestController
@RequestMapping("api/todos")
public class TodoController {
	
	private final TodoService todoService;
	
	
	
	public TodoController(TodoService todoService) {
		
		this.todoService = todoService;
	}

	
	@PostMapping
	List<Todo> createTodo(@RequestBody Todo todo){
		
		return todoService.createTodo(todo);
		
	}
	
	@GetMapping
	List<Todo> list(){
		
		return todoService.list();
		
	}
	
	@PutMapping
	List<Todo> update(@RequestBody Todo todo){
		
		return todoService.update(todo);
		
	}
	
	@DeleteMapping("/{id}")
	List<Todo> delete(@PathVariable("id") Long id){
		
		return todoService.delete(id);
		
	}

}
