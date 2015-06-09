package com.sale.dao;

import com.sale.model.ShoppingCart;

public interface ShopCartDao {
	
public abstract void insertShopCart(ShoppingCart scart);

public abstract void findShopCart(String customId);
}
