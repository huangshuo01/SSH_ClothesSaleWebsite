package com.sale.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sale.dao.OrderDao;
import com.sale.model.OrderInfo;
import com.sale.model.Orders;
import com.sale.model.ScartInfo;
import com.sale.service.OrderService;

@Transactional
public class OrderServiceImpl implements OrderService {
	@Resource
	OrderDao orderDao;

	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public void addOrder(List sinfolist, Orders orderA, String customId) {
		List sellerlist = orderDao.findSellerIdByScart(customId);
		for (int i = 0; i < sellerlist.size(); i++) {
			Orders order = new Orders();
			order.setOrderAddress(orderA.getOrderAddress());
			order.setOrderName(orderA.getOrderName());
			order.setOrderPhone(orderA.getOrderPhone());
			order.setCustomId(customId);
			order.setSellerId((String) sellerlist.get(i));
			Double sub = 0.0;
			for (int m = 0; m < sinfolist.size(); m++) {
				ScartInfo sinfoA = new ScartInfo();
				sinfoA = (ScartInfo) sinfolist.get(m);
				if (order.getSellerId().equals(sinfoA.getSellerId())) {
					sub += sinfoA.getShoppingSub();
				}
			}
			order.setOrderSub(sub);
			orderDao.addOrder(order);
			/*
			 * System.out.println(order.getCustomId());
			 * System.out.println(order.getOrderAddress());
			 * System.out.println(order.getOrderName());
			 * System.out.println(order.getSellerId());
			 * System.out.println(order.getOrderSub());
			 * System.out.println(order.getOrderPhone());
			 */
			for (int j = 0; j < sinfolist.size(); j++) {
				OrderInfo oinfo = new OrderInfo();
				ScartInfo sinfo = new ScartInfo();
				sinfo = (ScartInfo) sinfolist.get(j);
				if (order.getSellerId().equals(sinfo.getSellerId())) {
					oinfo.setOinfoName(sinfo.getGoodsName());
					oinfo.setOinfoNum(sinfo.getShoppingNum());
					oinfo.setOinfoPrice(sinfo.getGoodsPrice());
					oinfo.setOinfoSub(sinfo.getShoppingSub());
					oinfo.setOinfoType(sinfo.getGoodsType());
					oinfo.setOinfoPic(sinfo.getGoodsPic());
					oinfo.setOrders(order);
					orderDao.addOrderInfo(oinfo);
				}
				/*
				 * System.out.println(oinfo.getOinfoName());
				 * System.out.println(oinfo.getOinfoPic());
				 * System.out.println(oinfo.getOinfoType());
				 * System.out.println(oinfo.getOinfoNum());
				 * System.out.println(oinfo.getOinfoPrice());
				 * System.out.println(oinfo.getOinfoSub());
				 * System.out.println();
				 */
			}
			/* System.out.println(); */
		}
	}

}
