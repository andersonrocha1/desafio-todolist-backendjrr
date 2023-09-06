package com.andersondev.desafiotodolist.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.andersondev.desafiotodolist.model.Todo;
import com.andersondev.desafiotodolist.repository.TodoRepository;

@Service
public class TodoService {
	
	
	private final TodoRepository todoRepository;
	
	
	
	public TodoService(TodoRepository todoRepository) {
		
		this.todoRepository = todoRepository;
	}



	public List<Todo> createTodo(Todo todo){
		
		todoRepository.save(todo);
		 return list();
		
	}
	
	
	public List<Todo> list(){
		
		Sort sort = Sort.by("prioridade").descending()
				.and(Sort.by("nome").ascending());
		return todoRepository.findAll(sort);
		
	}
	
	
	public List<Todo> update(Todo todo){
		
		todoRepository.save(todo);
		return list();
		
	}
	
	
	public List<Todo> delete(long id){
		
		todoRepository.deleteById(id);
		return list();
		
	}

}