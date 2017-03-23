package com.wxy.work.service.impl;

import java.util.List;

import com.wxy.work.dao.UserDao;
import com.wxy.work.entity.User;
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
	public User load(Integer id) {
		return userDao.load(id);
	}

	@Override
	public User get(Integer id) {
		return userDao.get(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
 
	@Override
	public void persist(User entity) {
		userDao.persist(entity);
	}

	@Override
	public Integer save(User entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

	@Override
	public int findUser(String email, String md5Pwd) {
		return userDao.findUser(email, md5Pwd);
	}

	@Override
	public int findUser(String email) {
		return userDao.findUser(email);
		
	}

}
