package com.mytonooka.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytonooka.course.entites.Order;
import com.mytonooka.course.repositories.OrderRepository;
import com.mytonooka.course.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService  {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
}
