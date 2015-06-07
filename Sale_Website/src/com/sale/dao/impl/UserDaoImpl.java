package com.sale.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sale.dao.UserDao;
import com.sale.model.Seller;

public class UserDaoImpl implements UserDao {
	@Resource
	private SessionFactory sessionFactory;
	public List findSellerByIdPsd(int Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerId=? and sellerPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return list;
	}

	public List findCustomByIdPsd(int Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Custom where customId=? and customPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return list;
	}

	public List findAdminByIdPsd(int Id, String Password) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Adminer where adminerId=? and adminerPassword=?";
		try {
			session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter(0, Id);
			query.setParameter(1, Password);			
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sessionFactory.close();
		return list;
	}

}
