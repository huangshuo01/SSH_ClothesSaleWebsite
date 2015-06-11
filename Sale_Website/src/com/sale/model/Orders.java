package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private String orderName;
	private String orderPhone;
	private String orderAddress;
	private Double orderSub;
	private String sellerId;
	private String customId;
	private Set orderInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Integer orderId, String orderName, String orderPhone,
			String orderAddress, Double orderSub, String sellerId,
			String customId) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPhone = orderPhone;
		this.orderAddress = orderAddress;
		this.orderSub = orderSub;
		this.sellerId = sellerId;
		this.customId = customId;
	}

	/** full constructor */
	public Orders(Integer orderId, String orderName, String orderPhone,
			String orderAddress, Double orderSub, String sellerId,
			String customId, Set orderInfos) {
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPhone = orderPhone;
		this.orderAddress = orderAddress;
		this.orderSub = orderSub;
		this.sellerId = sellerId;
		this.customId = customId;
		this.orderInfos = orderInfos;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderPhone() {
		return this.orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderAddress() {
		return this.orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public Double getOrderSub() {
		return this.orderSub;
	}

	public void setOrderSub(Double orderSub) {
		this.orderSub = orderSub;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public Set getOrderInfos() {
		return this.orderInfos;
	}

	public void setOrderInfos(Set orderInfos) {
		this.orderInfos = orderInfos;
	}

}