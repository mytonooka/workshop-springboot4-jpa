package com.mytonooka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytonooka.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
