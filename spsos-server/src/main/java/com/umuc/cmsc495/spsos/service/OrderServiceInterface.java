package com.umuc.cmsc495.spsos.service;

import com.umuc.cmsc495.spsos.model.Order;

public interface OrderServiceInterface {
	
	Order createOrder(Order order);
	
	Order updateOrder(Order order);

}
