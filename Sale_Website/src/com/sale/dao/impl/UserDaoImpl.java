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
	
	public List findSellerByIdPsd(String Id, String Password) {
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
		session.close();
		return list;
	}

	public List findCustomByIdPsd(String  Id, String Password) {
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
		session.close();
		return list;
	}

	public List findAdminByIdPsd(String  Id, String Password) {
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
		session.close();
		return list;
	}

	public List findSellerById(String Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Seller where sellerId=?";
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

	public List findCustomById(String  Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Custom where customId=?";
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

	public List findAdminById(String  Id) {
		Session session = null;
		List list=null;
		Seller seller = new Seller();
		String hql = "from Adminer where adminerId=?";
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
}
