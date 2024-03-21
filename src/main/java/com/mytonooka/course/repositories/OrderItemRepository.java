package com.mytonooka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytonooka.course.entites.OrderItem;
import com.mytonooka.course.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
