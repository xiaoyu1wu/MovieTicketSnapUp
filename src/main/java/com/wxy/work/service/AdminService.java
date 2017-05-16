package com.wxy.work.service;

import java.util.List;

import com.wxy.work.entity.Admin;

public interface AdminService {
	Admin load(Integer id);

	Admin get(Integer id);

	List<Admin> findAll();

	void persist(Admin entity);

	Integer save(Admin entity);

	void saveOrUpdate(Admin entity);

	void delete(Integer id);

	void flush();
	
	//验证管理员
	Admin validate(Admin admin);
}
