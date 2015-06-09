package com.sale.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sale.dao.ShopCartDao;
import com.sale.model.ShoppingCart;

public class ShopCartDaoImpl implements ShopCartDao {
	@Resource
	SessionFactory sessionFactory;

	public void insertShopCart(ShoppingCart scart) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(scart);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void findShopCart(String customId) {
		// TODO Auto-generated method stub

	}

}
