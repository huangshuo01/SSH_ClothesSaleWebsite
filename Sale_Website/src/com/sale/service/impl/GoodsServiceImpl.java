package com.sale.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sale.dao.GoodsDao;
import com.sale.model.Goods;
import com.sale.service.GoodsService;
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsDao goodsDao;
    
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListAll() {
		return goodsDao.findGoodsListAll();
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListAllByTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListBySeller(String Id) {
		return goodsDao.findGoodsListBySeller(Id);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List getGoodsListBySellerType(int Id, String Type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addGoodsBySeller(Goods goods){
		goodsDao.insertGoodsBySeller(goods);
	}
}
