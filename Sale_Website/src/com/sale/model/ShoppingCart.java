package com.sale.model;

/**
 * ShoppingCart entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCart implements java.io.Serializable {

	// Fields

	private Integer shoppingCartId;
	private Integer goodsId;
	private String customId;
	private Integer shoppingNum;
	private Double shoppingSub;

	// Constructors

	/** default constructor */
	public ShoppingCart() {
	}

	/** minimal constructor */
	public ShoppingCart(Integer shoppingCartId, Integer goodsId,
			String customId, Integer shoppingNum) {
		this.shoppingCartId = shoppingCartId;
		this.goodsId = goodsId;
		this.customId = customId;
		this.shoppingNum = shoppingNum;
	}

	/** full constructor */
	public ShoppingCart(Integer shoppingCartId, Integer goodsId,
			String customId, Integer shoppingNum, Double shoppingSub) {
		this.shoppingCartId = shoppingCartId;
		this.goodsId = goodsId;
		this.customId = customId;
		this.shoppingNum = shoppingNum;
		this.shoppingSub = shoppingSub;
	}

	// Property accessors

	public Integer getShoppingCartId() {
		return this.shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
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