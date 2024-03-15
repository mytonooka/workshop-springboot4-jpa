package com.mytonooka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytonooka.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
