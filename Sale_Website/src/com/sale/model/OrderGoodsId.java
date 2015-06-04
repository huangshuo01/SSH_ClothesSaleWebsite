package com.sale.model;

/**
 * OrderGoodsId entity. @author MyEclipse Persistence Tools
 */

public class OrderGoodsId implements java.io.Serializable {

	// Fields

	private GoodsOrder goodsOrder;
	private Goods goods;
	private Integer shoppingNum;
	private Double shoppingSub;

	// Constructors

	/** default constructor */
	public OrderGoodsId() {
	}

	/** full constructor */
	public OrderGoodsId(GoodsOrder goodsOrder, Goods goods,
			Integer shoppingNum, Double shoppingSub) {
		this.goodsOrder = goodsOrder;
		this.goods = goods;
		this.shoppingNum = shoppingNum;
		this.shoppingSub = shoppingSub;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderGoodsId))
			return false;
		OrderGoodsId castOther = (OrderGoodsId) other;

		return ((this.getGoodsOrder() == castOther.getGoodsOrder()) || (this
				.getGoodsOrder() != null && castOther.getGoodsOrder() != null && this
				.getGoodsOrder().equals(castOther.getGoodsOrder())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())))
				&& ((this.getShoppingNum() == castOther.getShoppingNum()) || (this
						.getShoppingNum() != null
						&& castOther.getShoppingNum() != null && this
						.getShoppingNum().equals(castOther.getShoppingNum())))
				&& ((this.getShoppingSub() == castOther.getShoppingSub()) || (this
						.getShoppingSub() != null
						&& castOther.getShoppingSub() != null && this
						.getShoppingSub().equals(castOther.getShoppingSub())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGoodsOrder() == null ? 0 : this.getGoodsOrder()
						.hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		result = 37
				* result
				+ (getShoppingNum() == null ? 0 : this.getShoppingNum()
						.hashCode());
		result = 37
				* result
				+ (getShoppingSub() == null ? 0 : this.getShoppingSub()
						.hashCode());
		return result;
	}

}