package com.sale.dao;

import java.util.List;

public interface UserDao {
public abstract List findSellerByIdPsd(String Id,String Password);

public abstract List findCustomByIdPsd(String Id,String Password);

public abstract List findAdminByIdPsd(String Id,String Password);

public abstract List findSellerById(String Id);

public abstract List findCustomById(String Id);

public abstract List findAdminById(String Id);
}
