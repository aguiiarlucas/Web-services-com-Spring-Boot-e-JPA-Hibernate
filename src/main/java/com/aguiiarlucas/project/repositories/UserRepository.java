package com.aguiiarlucas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguiiarlucas.project.entities.User;

public interface  UserRepository extends JpaRepository<User, Long>{

}
