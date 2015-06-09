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
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)	
	public Goods getGoodsBygoodsId(Integer goodsId){
		return (Goods)goodsDao.findGoodsBygoodsId(goodsId).get(0);
	}
	
	public void addGoodsBySeller(Goods goods){
		goodsDao.insertGoodsBySeller(goods);
	}
	
	public void updateGoods(Goods goods){
		goodsDao.updateGoods(goods);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)		
	public void deleteGoodsBygoodsId(Goods goods){
		goods=(Goods)goodsDao.findGoodsBygoodsId(goods.getGoodsId()).get(0);
		goodsDao.deleteGoodsBygoodsId(goods);
	};

}
