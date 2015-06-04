package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * GoodsType entity. @author MyEclipse Persistence Tools
 */

public class GoodsType implements java.io.Serializable {

	// Fields

	private String goodsType;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public GoodsType() {
	}

	/** minimal constructor */
	public GoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	/** full constructor */
	public GoodsType(String goodsType, Set goodses) {
		this.goodsType = goodsType;
		this.goodses = goodses;
	}

	// Property accessors

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}