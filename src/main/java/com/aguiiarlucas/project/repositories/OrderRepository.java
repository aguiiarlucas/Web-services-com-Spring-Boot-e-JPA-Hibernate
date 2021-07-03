package com.aguiiarlucas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguiiarlucas.project.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long>{

}
