package com.wxy.work.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.AdminDao;
import com.wxy.work.dao.AdminDao;
import com.wxy.work.entity.Admin;
import com.wxy.work.entity.Admin;
import com.wxy.work.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public Admin load(Integer id) {
		return adminDao.load(id);
	}

	@Override
	public Admin get(Integer id) {
		return adminDao.get(id);
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.findAll();
	}
 
	@Override
	public void persist(Admin entity) {
		adminDao.persist(entity);
	}

	@Override
	public Integer save(Admin entity) {
		return adminDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Admin entity) {
		adminDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		adminDao.delete(id);
	}

	@Override
	public void flush() {
		adminDao.flush();
	}

	@Override
	public Admin validate(Admin admin) {
		return adminDao.findAdmin(admin);
	}

}
