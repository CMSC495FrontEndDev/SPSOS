package com.umuc.cmsc495.spsos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.umuc.cmsc495.spsos.model.Order;
import com.umuc.cmsc495.spsos.service.OrderServiceInterface;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServiceInterface orderService;

	@RequestMapping(method = RequestMethod.POST)
	private void createOrder(Order order) {
		orderService.createOrder(order);
	}

	@RequestMapping(method = RequestMethod.PUT)
	private void updateOrder(Order order) {
		orderService.updateOrder(order);
	}

}
