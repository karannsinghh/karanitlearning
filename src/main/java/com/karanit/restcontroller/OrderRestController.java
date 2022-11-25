package com.karanit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karanit.entity.Order;
import com.karanit.service.impl.OrderServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@Autowired
	private OrderServiceImpl serviceImpl;

	@PostMapping("/saveorder")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		Order body = serviceImpl.saveOrder(order);
		return ResponseEntity.ok(body);
	}

}
