package com.sale.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sale.dao.OrderDao;
import com.sale.model.OrderInfo;
import com.sale.model.Orders;
import com.sale.model.Seller;

public class OrderDaoImpl implements OrderDao {
	@Resource
	private SessionFactory sessionFactory;

	public List findSellerIdByScart(String customId) {
		Session session = null;
		List list = null;
		Seller seller = new Seller();
		String hql = "select distinct goods.seller.sellerId from ShoppingCart where custom.customId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, customId);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public void addOrder(Orders order) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(order);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	public void addOrderInfo(OrderInfo oinfo) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(oinfo);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
