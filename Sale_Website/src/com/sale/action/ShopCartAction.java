package com.sale.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Goods;
import com.sale.model.ShoppingCart;

public class ShopCartAction extends ActionSupport {
	@Resource
	GoodsAction goodsAction;
	private Goods goods;
	private ShoppingCart shoppingCart;

	@Override
	public String execute() throws Exception {
		return goodsAction.findGoodsListAll();
	}

	public String addShopCart() {
		
		return "addShopCart";
	}

	/**
	 * @return the goods
	 */
	public Goods getGoods() {
		return goods;
	}

	/**
	 * @param goods the goods to set
	 */
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	/**
	 * @return the shoppingCart
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	/**
	 * @param shoppingCart the shoppingCart to set
	 */
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
}
