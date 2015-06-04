package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Seller seller;
	private GoodsType goodsType;
	private GoodsStyle goodsStyle;
	private String goodsName;
	private String goodsPic;
	private Double goodsPrice;
	private Integer goodsNum;
	private Integer goodsSaleNum;
	private String goodsDescribe;
	private Set shoppingCarts = new HashSet(0);
	private Set orderGoodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Integer goodsId, Seller seller, String goodsName) {
		this.goodsId = goodsId;
		this.seller = seller;
		this.goodsName = goodsName;
	}

	/** full constructor */
	public Goods(Integer goodsId, Seller seller, GoodsType goodsType,
			GoodsStyle goodsStyle, String goodsName, String goodsPic,
			Double goodsPrice, Integer goodsNum, Integer goodsSaleNum,
			String goodsDescribe, Set shoppingCarts, Set orderGoodses) {
		this.goodsId = goodsId;
		this.seller = seller;
		this.goodsType = goodsType;
		this.goodsStyle = goodsStyle;
		this.goodsName = goodsName;
		this.goodsPic = goodsPic;
		this.goodsPrice = goodsPrice;
		this.goodsNum = goodsNum;
		this.goodsSaleNum = goodsSaleNum;
		this.goodsDescribe = goodsDescribe;
		this.shoppingCarts = shoppingCarts;
		this.orderGoodses = orderGoodses;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public GoodsType getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public GoodsStyle getGoodsStyle() {
		return this.goodsStyle;
	}

	public void setGoodsStyle(GoodsStyle goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPic() {
		return this.goodsPic;
	}

	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}

	public Double getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsNum() {
		return this.goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public Integer getGoodsSaleNum() {
		return this.goodsSaleNum;
	}

	public void setGoodsSaleNum(Integer goodsSaleNum) {
		this.goodsSaleNum = goodsSaleNum;
	}

	public String getGoodsDescribe() {
		return this.goodsDescribe;
	}

	public void setGoodsDescribe(String goodsDescribe) {
		this.goodsDescribe = goodsDescribe;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

	public Set getOrderGoodses() {
		return this.orderGoodses;
	}

	public void setOrderGoodses(Set orderGoodses) {
		this.orderGoodses = orderGoodses;
	}

}