package com.wxy.work.service.impl;

import java.util.List;

import com.wxy.work.dao.UserDao;
import com.wxy.work.entity.AcctUser;
import com.wxy.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建时间：2015-2-6 下午3:24:16
 * 
 * @author andy
 * @version 2.2 UserService 的实现
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public AcctUser load(String id) {
		return userDao.load(id);
	}

	@Override
	public AcctUser get(String id) {
		return userDao.get(id);
	}

	@Override
	public List<AcctUser> findAll() {
		return userDao.findAll();
	}
 
	@Override
	public void persist(AcctUser entity) {
		userDao.persist(entity);
	}

	@Override
	public String save(AcctUser entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(AcctUser entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

}
