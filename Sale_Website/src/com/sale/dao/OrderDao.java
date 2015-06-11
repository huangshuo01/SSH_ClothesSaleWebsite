package com.sale.dao;

import java.util.List;

import com.sale.model.OrderInfo;
import com.sale.model.Orders;

public interface OrderDao {
	public abstract List findSellerIdByScart(String customId);
	
	public abstract void addOrder(Orders order);
	
	public abstract void addOrderInfo(OrderInfo oinfo);

}
