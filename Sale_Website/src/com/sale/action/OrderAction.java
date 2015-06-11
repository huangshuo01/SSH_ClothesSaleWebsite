package com.sale.action;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.OrderInfo;
import com.sale.model.Orders;
import com.sale.model.ScartInfo;
import com.sale.model.ShoppingCart;
import com.sale.service.OrderService;

public class OrderAction extends ActionSupport {
	@Resource
	OrderService orderService;
	private Orders order;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	public String addOrder(){
		ActionContext ac=ActionContext.getContext();
		List list=(List)ac.getSession().get("sinfolist");
		String customId=(String)ac.getSession().get("Id");
		orderService.addOrder(list,order,customId);
		return "addOrder";
	}
	/**
	 * @return the order
	 */
	public Orders getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Orders order) {
		this.order = order;
	}
}
