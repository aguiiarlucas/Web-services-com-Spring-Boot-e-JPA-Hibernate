package com.aguiiarlucas.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguiiarlucas.project.entities.Product;
import com.aguiiarlucas.project.entities.User;
import com.aguiiarlucas.project.services.ProductService;

//	[ Annotation: Implementando recursos ]
@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	public ProductService service;

// [EndPoint para acessar os Usuarios]
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
		public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}