package com.andersondev.desafiotodolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.andersondev.desafiotodolist.model.Todo;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT )
class DesafioTodoListApplicationTests {
	
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSucess() {
		
		var todo = new Todo("todo 1: documentar", "Documentar projeto", false, 1);
		
		webTestClient
		.post()
		.uri("api/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isCreated()
		.expectBody()
		.jsonPath("$").isArray()
		.jsonPath("$.length()").isEqualTo(1)
		.jsonPath("$[0].nome").isEqualTo(todo.getNome())
		.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
		.jsonPath("$[0].realizado").isEqualTo(todo.isRealizado())
		.jsonPath("$[0].prioridade").isEqualTo(todo.getPrioridade());
		
	}
	
	@Test
	void testCreateTodoFailure() {
		
		webTestClient
		.post()
		.uri("api/todos")
		.bodyValue(
				new Todo("", "", false, 0))
		.exchange()
		.expectStatus().isBadRequest();
		
	}
	

	
}
