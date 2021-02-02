package com.bolosdamaisa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolosdamaisa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
