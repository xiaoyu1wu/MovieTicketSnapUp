package com.wxy.work.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wxy.work.dao.HallDao;
import com.wxy.work.entity.Cinema;
import com.wxy.work.entity.Hall;

@Repository("hallDao")
public class HallDaoImpl implements HallDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Hall load(Integer id) {
		return (Hall) this.getCurrentSession().load(Hall.class, id);
		}

	@Override
	public Hall get(Integer id) {
		return (Hall) this.getCurrentSession().get(Hall.class, id);
	}

	@Override
	public List<Hall> findAll() {
		List<Hall> halls = this.getCurrentSession().createQuery("from Hall").setCacheable(true).list();
		return null;
	}

	@Override
	public void persist(Hall entity) {
		this.getCurrentSession().persist(entity);
		
	}

	@Override
	public Integer save(Hall entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Hall entity) {
		this.getCurrentSession().saveOrUpdate(entity);
		
	}

	@Override
	public void delete(Integer id) {
		Hall entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();
		
	}

	@Override
	public Hall getSeatByHallId(Integer hallId) {
		String hql = "from Hall h where h.hallId = :hallId";
		Hall hall = (Hall)this.getCurrentSession().createQuery(hql).setParameter("hallId", hallId).list().get(0);
		return hall;
	}

	@Override
	public Hall getSeatByHallId(Integer hallNum, Integer cinemaId) {
		Cinema cinema = new Cinema();
		cinema.setCinemaId(cinemaId);
		String hql = "from Hall h where h.number = :hallNum and h.cinema = :cinema";
		Hall hall = (Hall)this.getCurrentSession().createQuery(hql).setParameter("hallNum", hallNum).setParameter("cinema", cinema).list().get(0);
		return hall;
	}

}
