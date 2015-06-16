package com.sale.dao;

import java.util.List;
import  com.sale.model.Custom;

public interface CustomDao {
	    public abstract void updateCustom(Custom custom);  
	    public abstract Custom findCustomById(String Id);  
	    public abstract List checkCustomByName(String Name);
	    public abstract List checkCustomById(String Id);
}
