package com.aguiiarlucas.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aguiiarlucas.project.entities.OrderItem;

public interface  OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
