package com.sale.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Custom entity. @author MyEclipse Persistence Tools
 */

public class Custom implements java.io.Serializable {

	// Fields

	private Integer customId;
	private String customBorn;
	private String customName;
	private String customSex;
	private String customEmail;
	private String customMsn;
	private String customQq;
	private String customOfficerphone;
	private String customHomephone;
	private String customMobilephone;
	private String customPassword;
	private Set goodsOrders = new HashSet(0);
	private Set shoppingCarts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Custom() {
	}

	/** minimal constructor */
	public Custom(Integer customId) {
		this.customId = customId;
	}

	/** full constructor */
	public Custom(Integer customId, String customBorn, String customName,
			String customSex, String customEmail, String customMsn,
			String customQq, String customOfficerphone, String customHomephone,
			String customMobilephone, String customPassword, Set goodsOrders,
			Set shoppingCarts) {
		this.customId = customId;
		this.customBorn = customBorn;
		this.customName = customName;
		this.customSex = customSex;
		this.customEmail = customEmail;
		this.customMsn = customMsn;
		this.customQq = customQq;
		this.customOfficerphone = customOfficerphone;
		this.customHomephone = customHomephone;
		this.customMobilephone = customMobilephone;
		this.customPassword = customPassword;
		this.goodsOrders = goodsOrders;
		this.shoppingCarts = shoppingCarts;
	}

	// Property accessors

	public Integer getCustomId() {
		return this.customId;
	}

	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	public String getCustomBorn() {
		return this.customBorn;
	}

	public void setCustomBorn(String customBorn) {
		this.customBorn = customBorn;
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getCustomSex() {
		return this.customSex;
	}

	public void setCustomSex(String customSex) {
		this.customSex = customSex;
	}

	public String getCustomEmail() {
		return this.customEmail;
	}

	public void setCustomEmail(String customEmail) {
		this.customEmail = customEmail;
	}

	public String getCustomMsn() {
		return this.customMsn;
	}

	public void setCustomMsn(String customMsn) {
		this.customMsn = customMsn;
	}

	public String getCustomQq() {
		return this.customQq;
	}

	public void setCustomQq(String customQq) {
		this.customQq = customQq;
	}

	public String getCustomOfficerphone() {
		return this.customOfficerphone;
	}

	public void setCustomOfficerphone(String customOfficerphone) {
		this.customOfficerphone = customOfficerphone;
	}

	public String getCustomHomephone() {
		return this.customHomephone;
	}

	public void setCustomHomephone(String customHomephone) {
		this.customHomephone = customHomephone;
	}

	public String getCustomMobilephone() {
		return this.customMobilephone;
	}

	public void setCustomMobilephone(String customMobilephone) {
		this.customMobilephone = customMobilephone;
	}

	public String getCustomPassword() {
		return this.customPassword;
	}

	public void setCustomPassword(String customPassword) {
		this.customPassword = customPassword;
	}

	public Set getGoodsOrders() {
		return this.goodsOrders;
	}

	public void setGoodsOrders(Set goodsOrders) {
		this.goodsOrders = goodsOrders;
	}

	public Set getShoppingCarts() {
		return this.shoppingCarts;
	}

	public void setShoppingCarts(Set shoppingCarts) {
		this.shoppingCarts = shoppingCarts;
	}

}