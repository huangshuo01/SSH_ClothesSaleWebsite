package com.sale.dao;

import java.util.List;

public interface UserDao {
public abstract List findSellerByIdPsd(int Id,String Password);

public abstract List findCustomByIdPsd(int Id,String Password);

public abstract List findAdminByIdPsd(int Id,String Password);
}
