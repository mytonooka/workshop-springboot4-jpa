package com.mytonooka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytonooka.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
