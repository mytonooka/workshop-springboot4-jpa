package com.mytonooka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytonooka.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
