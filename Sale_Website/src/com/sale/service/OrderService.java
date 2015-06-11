package com.sale.service;

import java.util.List;

import com.sale.model.Orders;

public interface OrderService {
	public abstract void addOrder(List sinfolist,Orders orderA,String customId);
}
