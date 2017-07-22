package com.umuc.cmsc495.spsos.service;

import com.umuc.cmsc495.spsos.dm.Order;

public interface OrderService {
	
	Order createOrder(Order order);
	
	Order updateOrder(Order order);

}
