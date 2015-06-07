package com.sale.service;

import javax.annotation.Resource;

import com.sale.dao.UserDao;
import com.sale.model.Adminer;
import com.sale.model.Custom;
import com.sale.model.Seller;

public interface LoginService {
public abstract Seller getSellerByIdPsd(int Id ,String Password);

public abstract Custom getCustomByIdPsd(int Id ,String Password);

public abstract Adminer getAdminByIdPsd(int Id ,String Password);

public abstract Boolean checkSellerLogin(int Id,String Password);

public abstract Boolean checkCustomLogin(int Id,String Password);

public abstract Boolean checkAdminLogin(int Id,String Password);
}
