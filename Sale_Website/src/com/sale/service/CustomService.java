package com.sale.service;

import java.util.List;  

import com.sale.model.Custom;;  

public interface CustomService {
	 	public void doCreateCustom(Custom custom);  
	    public List<Custom> findAllCustom();  
	    public void delete(Custom custom);  
	    public void update(Custom custom);  
	    public Custom findCustomById(int CustomId); 
}
