package com.gcu;

import java.util.ArrayList;
import java.util.List;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface{

	@Override
	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L, "0000000001", "Product 6", 1.00f, 1));
		orders.add(new OrderModel(1L, "0000000002", "Product 7", 2.00f, 2));
		orders.add(new OrderModel(2L, "0000000003", "Product 8", 3.00f, 3));
		orders.add(new OrderModel(3L, "0000000004", "Product 9", 4.00f, 4));
		orders.add(new OrderModel(4L, "0000000005", "Product 10", 5.00f, 5));
		return orders;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
