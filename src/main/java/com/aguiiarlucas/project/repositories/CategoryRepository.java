package com.aguiiarlucas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguiiarlucas.project.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{

}
