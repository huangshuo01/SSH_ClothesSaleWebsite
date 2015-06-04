package com.sale.model;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCart implements java.io.Serializable {

	// Fields

	private ShoppingCartId id;
	private Integer shoppingNum;
	private Double shoppingSub;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** minimal constructor */
	public ShoppingCart(ShoppingCartId id) {
		this.id = id;
	}

	/** full constructor */
	public ShoppingCart(ShoppingCartId id, Integer shoppingNum,
			Double shoppingSub) {
		this.id = id;
		this.shoppingNum = shoppingNum;
		this.shoppingSub = shoppingSub;
	}

	// Property accessors

	public ShoppingCartId getId() {
		return this.id;
	}

	public void setId(ShoppingCartId id) {
		this.id = id;
	}

	public Integer getShoppingNum() {
		return this.shoppingNum;
	}

	public void setShoppingNum(Integer shoppingNum) {
		this.shoppingNum = shoppingNum;
	}

	public Double getShoppingSub() {
		return this.shoppingSub;
	}

	public void setShoppingSub(Double shoppingSub) {
		this.shoppingSub = shoppingSub;
	}

}