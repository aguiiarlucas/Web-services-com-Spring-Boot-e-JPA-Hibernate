package com.aguiiarlucas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguiiarlucas.project.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long>{

}
