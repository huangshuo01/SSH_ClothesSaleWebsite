package com.sale.model;

/**
 * OrderGoods entity. @author MyEclipse Persistence Tools
 */

public class OrderGoods implements java.io.Serializable {

	// Fields

	private OrderGoodsId id;
	private GoodsOrder goodsOrder;
	private Goods goods;

	// Constructors

	/** default constructor */
	public OrderGoods() {
	}

	/** minimal constructor */
	public OrderGoods(OrderGoodsId id) {
		this.id = id;
	}

	/** full constructor */
	public OrderGoods(OrderGoodsId id, GoodsOrder goodsOrder, Goods goods) {
		this.id = id;
		this.goodsOrder = goodsOrder;
		this.goods = goods;
	}

	// Property accessors

	public OrderGoodsId getId() {
		return this.id;
	}

	public void setId(OrderGoodsId id) {
		this.id = id;
	}

	public GoodsOrder getGoodsOrder() {
		return this.goodsOrder;
	}

	public void setGoodsOrder(GoodsOrder goodsOrder) {
		this.goodsOrder = goodsOrder;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}