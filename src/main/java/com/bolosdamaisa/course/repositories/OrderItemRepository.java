package com.bolosdamaisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolosdamaisa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
