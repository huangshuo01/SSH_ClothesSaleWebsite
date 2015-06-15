package com.sale.dao.impl;

import java.util.List;  

import com.sale.model.Custom;
import com.sale.dao.CustomDAO;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;  

public class CustomDAOimpl extends HibernateDaoSupport implements CustomDAO  {
	public void doCreateCustom(Custom custom) {  
        this.getHibernateTemplate().save(custom);  
    }  
  
    @SuppressWarnings("unchecked")  
    public List<Custom> findAllCustom() {  
        String hql = "from User u order by Custom.customId asc";  
        List<Custom> list = this.getHibernateTemplate().find(hql);  
        return list;  
    }  
  
    public void removeCustom(Custom custom) {  
        this.getHibernateTemplate().delete(custom);  
    }  
  
    public void updateCustom(Custom custom) {  
        this.getHibernateTemplate().update(custom);  
    }  
  
    public Custom findCustomById(int CustomId) {  
    	Custom custom = null;  
    	custom = (Custom) this.getHibernateTemplate().get(Custom.class, CustomId);  
        return custom;  
    }

}
