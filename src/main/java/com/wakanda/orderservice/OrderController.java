package com.wakanda.orderservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wakanda.orderservice.entities.Order;

@RestController
public class OrderController {

	@GetMapping("/") 
	public List<Order> getOrders() {
		 List<Order> orders = new ArrayList<>();
		 orders.add(new Order(1,"amit Saxena", 100));
		 orders.add(new Order(2,"chitrakshi Saxena", 200));
		 orders.add(new Order(3,"Ayushi Saxena", 300));
		 return orders;
	}
}
