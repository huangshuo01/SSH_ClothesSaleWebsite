package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * GoodsStyle entity. @author MyEclipse Persistence Tools
 */

public class GoodsStyle implements java.io.Serializable {

	// Fields

	private String goodsStyle;
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public GoodsStyle() {
	}

	/** minimal constructor */
	public GoodsStyle(String goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	/** full constructor */
	public GoodsStyle(String goodsStyle, Set goodses) {
		this.goodsStyle = goodsStyle;
		this.goodses = goodses;
	}

	// Property accessors

	public String getGoodsStyle() {
		return this.goodsStyle;
	}

	public void setGoodsStyle(String goodsStyle) {
		this.goodsStyle = goodsStyle;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}