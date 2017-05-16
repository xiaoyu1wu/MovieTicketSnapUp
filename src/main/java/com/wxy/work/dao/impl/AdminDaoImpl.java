package com.wxy.work.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wxy.work.dao.AdminDao;
import com.wxy.work.entity.Admin;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public Admin load(Integer id) {
		return (Admin) this.getCurrentSession().load(Admin.class, id);
	}
	
	@Override
	public Admin get(Integer id) {
		return (Admin) this.getCurrentSession().get(Admin.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAll() {
		List<Admin> Admins = this.getCurrentSession().createQuery("from Admin").setCacheable(true).list();
		return Admins;
	}

	@Override
	public void persist(Admin entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(Admin entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Admin entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		Admin entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

	@Override
	public Admin findAdmin(Admin admin) {
		String hql = "from Admin a where a.adminName = :name and a.adminPassword = :password";
		List<Admin> ads = this.getCurrentSession().createQuery(hql).setParameter("name", admin.getAdminName()).setParameter("password", admin.getAdminPassword()).list();
		if(ads.size()==0){
			return null;
		}else{
			return ads.get(0);
		}
	}

}
