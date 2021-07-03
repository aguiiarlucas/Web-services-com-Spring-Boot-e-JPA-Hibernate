package com.aguiiarlucas.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguiiarlucas.project.entities.User;
import com.aguiiarlucas.project.services.UserService;

//	[ Annotation: Implementando recursos ]
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	public UserService service;

// [EndPoint para acessar os Usuarios]
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
		public ResponseEntity<User>findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}