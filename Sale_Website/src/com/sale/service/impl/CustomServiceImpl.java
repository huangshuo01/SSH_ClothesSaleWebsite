package com.sale.service.impl;

import java.util.List;

import com.sale.model.Custom;
import com.sale.dao.CustomDAO;
import com.sale.service.CustomService;

public class CustomServiceImpl implements CustomService{
	private CustomDAO dao;  
    
    public CustomDAO getDao() {  
        return dao;  
    }  
  
    public void setDao(CustomDAO dao) {  
        this.dao = dao;  
    }  
  
    public void doCreateCustom(Custom custom) {  
        this.dao.doCreateCustom(custom);  
    }  
  
    public List<Custom> findAllCustom() {  
        return this.dao.findAllCustom();  
    }  
  
    public void delete(Custom custom) {  
        this.dao.removeCustom(custom);  
    }  
  
    public void update(Custom custom) {  
        this.dao.updateCustom(custom);  
    }  
  
    public Custom findCustomById(int CustomId) {  
        return this.dao.findCustomById(CustomId);  
    }  
}
