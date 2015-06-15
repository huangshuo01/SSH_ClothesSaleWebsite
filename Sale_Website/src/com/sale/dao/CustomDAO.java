package com.sale.dao;

import java.util.List;
import  com.sale.model.Custom;

public interface CustomDAO {
	 	public void doCreateCustom(Custom Custom);  
	    public List<Custom> findAllCustom();  
	    public void removeCustom(Custom Custom);  
	    public void updateCustom(Custom Custom);  
	    public Custom findCustomById(int customId);  
}
