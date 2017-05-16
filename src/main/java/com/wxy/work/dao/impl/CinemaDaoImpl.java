package com.wxy.work.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wxy.work.dao.CinemaDao;
import com.wxy.work.entity.Cinema;
@Repository("cinemaDao")
public class CinemaDaoImpl implements CinemaDao{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public Cinema load(Integer id) {
		return (Cinema) this.getCurrentSession().load(Cinema.class, id);
	}
	
	@Override
	public Cinema get(Integer id) {
		return (Cinema) this.getCurrentSession().get(Cinema.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cinema> findAll() {
		List<Cinema> Users = this.getCurrentSession().createQuery("from Cinema").setCacheable(true).list();
		return Users;
	}

	@Override
	public void persist(Cinema entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(Cinema entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Cinema entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		Cinema entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();
	}

	@Transactional
	@Override
	public Cinema findByName(String name) {
		String hql = "from Cinema c where c.name = :name";
		Cinema cinema = (Cinema) this.getCurrentSession().createQuery(hql).setParameter("name", name).list().get(0);
		return cinema;
	}
	
	@Transactional
	@Override
	public List<Cinema> findByLikeName(String name) {
		String hql = "from Cinema c where c.name like :name";
		List<Cinema> cinemas = this.getCurrentSession().createQuery(hql).setParameter("name", "%"+name+"%").list();
		return cinemas;
	}

}
