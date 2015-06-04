package com.sale.model;

/**
 * ShoppingCartId entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCartId implements java.io.Serializable {

	// Fields

	private Custom custom;
	private Goods goods;

	// Constructors

	/** default constructor */
	public ShoppingCartId() {
	}

	/** full constructor */
	public ShoppingCartId(Custom custom, Goods goods) {
		this.custom = custom;
		this.goods = goods;
	}

	// Property accessors

	public Custom getCustom() {
		return this.custom;
	}

	public void setCustom(Custom custom) {
		this.custom = custom;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ShoppingCartId))
			return false;
		ShoppingCartId castOther = (ShoppingCartId) other;

		return ((this.getCustom() == castOther.getCustom()) || (this
				.getCustom() != null && castOther.getCustom() != null && this
				.getCustom().equals(castOther.getCustom())))
				&& ((this.getGoods() == castOther.getGoods()) || (this
						.getGoods() != null && castOther.getGoods() != null && this
						.getGoods().equals(castOther.getGoods())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustom() == null ? 0 : this.getCustom().hashCode());
		result = 37 * result
				+ (getGoods() == null ? 0 : this.getGoods().hashCode());
		return result;
	}

}