package com.wxy.work.dao.impl;

import java.util.List;

import com.wxy.work.dao.UserDao;
import com.wxy.work.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 创建时间：2015-2-6 下午2:45:14
 * 
 * @author andy
 * @version 2.2
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public User load(Integer id) {
		return (User) this.getCurrentSession().load(User.class, id);
	}
	
	@Override
	public User get(Integer id) {
		return (User) this.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		List<User> Users = this.getCurrentSession().createQuery("from User").setCacheable(true).list();
		return Users;
	}

	@Override
	public void persist(User entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(User entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		User entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

	@Override
	public int findUser(String email, String md5Pwd) {
		String sql = "select IFNULL(MAX(user_id), -1) as user_id from user " +
					"where user_email = ? and user_password = ?";
		Number userId = (Number)this.getCurrentSession().createSQLQuery(sql).setString(0, email).setString(1, md5Pwd).list().get(0);
		return userId.intValue();
	}
	
	@Transactional
	@Override
	public int findUser(String email) {
		String sql = "select IFNULL(MAX(user_id), -1) as user_id from user " +
					"where user_email = ?";
		
		Number userId = (Number) this.getCurrentSession().createSQLQuery(sql).setString(0, email).list().get(0);
		return userId.intValue();
 	}

}
