package com.sale.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.model.Custom;
import com.sale.dao.CustomDao;
import com.sale.service.CustomService;

@Transactional
public class CustomServiceImpl implements CustomService{
	@Resource
	CustomDao customDao;
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Custom getCustomById(String customId) {
		return (Custom) customDao.findCustomById(customId);
	}
    
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void updateCustom(Custom custom) {
		customDao.updateCustom(custom);
	}
}
