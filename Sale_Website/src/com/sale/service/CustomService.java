package com.sale.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.model.Custom;;  

public interface CustomService {
	 	public abstract void updateCustom(Custom custom);
	    public abstract Custom getCustomById(String customId);
}
