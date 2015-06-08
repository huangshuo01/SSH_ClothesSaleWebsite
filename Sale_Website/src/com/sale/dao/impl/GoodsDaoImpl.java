package com.sale.dao.impl;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sale.dao.GoodsDao;
import com.sale.model.Goods;
import com.sale.model.Seller;

public class GoodsDaoImpl implements GoodsDao {
	@Resource
	SessionFactory sessionFactory;
	public List findGoodsListAll() {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
//			query.setParameter(0, Id);	
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findGoodsListAllByTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public List findGoodsListBySeller(int Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Goods where seller.sellerId=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);	
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return list;
	}

	public List findGoodsListBySellerType(int Id ,String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertGoodsBySeller(Goods goods){
		Random random = new Random();
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.getCurrentSession();
			tx = session.beginTransaction();
			goods.setGoodsId(random.nextInt(899999) + 100000);
			session.save(goods);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}
}
