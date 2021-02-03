package com.bolosdamaisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolosdamaisa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
