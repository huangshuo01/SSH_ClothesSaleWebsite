package com.sale.model;

import java.sql.Timestamp;

/**
 * GoodsOrder entity. @author MyEclipse Persistence Tools
 */

public class GoodsOrder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Custom custom;
	private Seller seller;
	private String orderAdr;
	private String orderState;
	private String paymentState;
	private Double orderMoney;
	private String acceptName;
	private String acceptPhone;
	private Timestamp orderDate;

	// Constructors

	/** default constructor */
	public GoodsOrder() {
	}

	/** minimal constructor */
	public GoodsOrder(Integer orderId, Custom custom, String orderAdr,
			Double orderMoney, String acceptName, String acceptPhone) {
		this.orderId = orderId;
		this.custom = custom;
		this.orderAdr = orderAdr;
		this.orderMoney = orderMoney;
		this.acceptName = acceptName;
		this.acceptPhone = acceptPhone;
	}

	/** full constructor */
	public GoodsOrder(Integer orderId, Custom custom, Seller seller,
			String orderAdr, String orderState, String paymentState,
			Double orderMoney, String acceptName, String acceptPhone,
			Timestamp orderDate) {
		this.orderId = orderId;
		this.custom = custom;
		this.seller = seller;
		this.orderAdr = orderAdr;
		this.orderState = orderState;
		this.paymentState = paymentState;
		this.orderMoney = orderMoney;
		this.acceptName = acceptName;
		this.acceptPhone = acceptPhone;
		this.orderDate = orderDate;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Custom getCustom() {
		return this.custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getOrderAdr() {
		return this.orderAdr;
	}

	public void setOrderAdr(String orderAdr) {
		this.orderAdr = orderAdr;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getPaymentState() {
		return this.paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public Double getOrderMoney() {
		return this.orderMoney;
	}

	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	public String getAcceptName() {
		return this.acceptName;
	}

	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}

	public String getAcceptPhone() {
		return this.acceptPhone;
	}

	public void setAcceptPhone(String acceptPhone) {
		this.acceptPhone = acceptPhone;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

}