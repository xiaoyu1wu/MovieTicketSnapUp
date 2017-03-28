package com.wxy.work.service;

import java.util.List;

import com.wxy.work.entity.User;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  userService接口
 */

public interface UserService {
	User load(Integer id);

	User get(Integer id);

	List<User> findAll();

	void persist(User entity);

	Integer save(User entity);

	void saveOrUpdate(User entity);

	void delete(Integer id);

	void flush();

	int findUser(String email, String md5Pwd);

	int findUser(String email);

}
