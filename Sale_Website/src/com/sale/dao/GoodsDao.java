package com.sale.dao;

import java.util.List;

import com.sale.model.Goods;

public interface GoodsDao {
	public abstract List findGoodsListAll();
	
	public abstract List findGoodsListAllByTime();
	
	public abstract List findGoodsListBySeller(int Id);
	
	public abstract List findGoodsListBySellerType(int Id ,String Type);
	
	public abstract void insertGoodsBySeller(Goods goods);
}
