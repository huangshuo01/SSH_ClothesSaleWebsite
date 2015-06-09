package com.sale.dao;

import java.util.List;

import com.sale.model.Goods;

public interface GoodsDao {
	public abstract List findGoodsListAll();
	
	public abstract List findGoodsListAllByTime();
	
	public abstract List findGoodsListBySeller(String Id);
	
	public abstract List findGoodsListBySellerType(int Id ,String Type);
	
	public abstract void insertGoodsBySeller(Goods goods);
	
	public abstract List findGoodsBygoodsId(Integer goodsId);
	
	public abstract void updateGoods(Goods goods);
	
	public abstract void deleteGoodsBygoodsId(Goods goods);
}
