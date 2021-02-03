package com.bolosdamaisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolosdamaisa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
