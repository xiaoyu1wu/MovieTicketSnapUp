package com.wxy.work.dao;

import com.wxy.work.entity.AcctUser;
import com.wxy.work.entity.User;

/**
 * 创建时间：2015-2-6 下午2:43:50
 * 
 * @author andy
 * @version 2.2
 * 
 * 用户Dao接口
 */

public interface UserDao extends GenericDao<User, Integer> {

	int findUser(String email, String md5Pwd);

	int findUser(String email);

}
