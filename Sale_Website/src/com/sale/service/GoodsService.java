package com.sale.service;

import java.util.List;

import com.sale.model.Goods;

public interface GoodsService {
	public abstract List getGoodsListAll();
	
	public abstract List getGoodsListAllByTime();
	
	public abstract List getGoodsListBySeller(String Id);
	
	public abstract List getGoodsListBySellerType(int Id ,String Type);

	public abstract void addGoodsBySeller(Goods goods);
	
	public abstract Goods getGoodsBygoodsId(Integer goodsId);

	public abstract void updateGoods(Goods goods);
	
	public abstract void deleteGoodsBygoodsId(Goods goods);
}
