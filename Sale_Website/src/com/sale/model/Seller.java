package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */

public class Seller implements java.io.Serializable {

	// Fields

	private Integer sellerId;
	private String sellerBorn;
	private String sellerName;
	private String sellerSex;
	private String sellerEmail;
	private String sellerMsn;
	private String sellerQq;
	private String sellerOfficerphone;
	private String sellerHomephone;
	private String sellerMobilephone;
	private String sellerPassword;
	private Set goodsOrders = new HashSet(0);
	private Set goodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** minimal constructor */
	public Seller(Integer sellerId) {
		this.sellerId = sellerId;
	}

	/** full constructor */
	public Seller(Integer sellerId, String sellerBorn, String sellerName,
			String sellerSex, String sellerEmail, String sellerMsn,
			String sellerQq, String sellerOfficerphone, String sellerHomephone,
			String sellerMobilephone, String sellerPassword, Set goodsOrders,
			Set goodses) {
		this.sellerId = sellerId;
		this.sellerBorn = sellerBorn;
		this.sellerName = sellerName;
		this.sellerSex = sellerSex;
		this.sellerEmail = sellerEmail;
		this.sellerMsn = sellerMsn;
		this.sellerQq = sellerQq;
		this.sellerOfficerphone = sellerOfficerphone;
		this.sellerHomephone = sellerHomephone;
		this.sellerMobilephone = sellerMobilephone;
		this.sellerPassword = sellerPassword;
		this.goodsOrders = goodsOrders;
		this.goodses = goodses;
	}

	// Property accessors

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerBorn() {
		return this.sellerBorn;
	}

	public void setSellerBorn(String sellerBorn) {
		this.sellerBorn = sellerBorn;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerSex() {
		return this.sellerSex;
	}

	public void setSellerSex(String sellerSex) {
		this.sellerSex = sellerSex;
	}

	public String getSellerEmail() {
		return this.sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerMsn() {
		return this.sellerMsn;
	}

	public void setSellerMsn(String sellerMsn) {
		this.sellerMsn = sellerMsn;
	}

	public String getSellerQq() {
		return this.sellerQq;
	}

	public void setSellerQq(String sellerQq) {
		this.sellerQq = sellerQq;
	}

	public String getSellerOfficerphone() {
		return this.sellerOfficerphone;
	}

	public void setSellerOfficerphone(String sellerOfficerphone) {
		this.sellerOfficerphone = sellerOfficerphone;
	}

	public String getSellerHomephone() {
		return this.sellerHomephone;
	}

	public void setSellerHomephone(String sellerHomephone) {
		this.sellerHomephone = sellerHomephone;
	}

	public String getSellerMobilephone() {
		return this.sellerMobilephone;
	}

	public void setSellerMobilephone(String sellerMobilephone) {
		this.sellerMobilephone = sellerMobilephone;
	}

	public String getSellerPassword() {
		return this.sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public Set getGoodsOrders() {
		return this.goodsOrders;
	}

	public void setGoodsOrders(Set goodsOrders) {
		this.goodsOrders = goodsOrders;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

}