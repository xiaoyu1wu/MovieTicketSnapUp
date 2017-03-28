package com.wxy.work.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wxy.work.dao.MovieDao;
import com.wxy.work.entity.Movie;

@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Movie load(Integer id) {
		return (Movie) this.getCurrentSession().load(Movie.class, id);
	}
	
	@Override
	public Movie get(Integer id) {
		return (Movie) this.getCurrentSession().get(Movie.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> findAll() {
		List<Movie> Movies = this.getCurrentSession().createQuery("from Movie").setCacheable(true).list();
		return Movies;
	}

	@Override
	public void persist(Movie entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(Movie entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Movie entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		Movie entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

	@Override
	public List<Movie> queryForPage(int offset, int length) {
		List<Movie> entityList = null;
		try{
			Query query = this.getCurrentSession().createQuery("from Movie");
			query.setFirstResult(offset);
			query.setMaxResults(length);
			entityList = query.list();
		}catch(Exception e){
			throw e;
		}
		return entityList;
	}
	
	@Transactional
	@Override
	public List<Movie> queryForPage(int offset, int length, String type) {
		List<Movie> entityList = null;
		try{
			Query query = null;
			//查询所有的记录
			if(("all").equals(type)){
				query = this.getCurrentSession().createQuery("from Movie m");
			}
			else{	//查询对应类型的记录
				query = this.getCurrentSession().createQuery("from Movie m where m.type like :type").setParameter("type", "%" + type + "%");
			}
			query.setFirstResult(offset);
			query.setMaxResults(length);
			entityList = query.list();
		}catch(Exception e){
			throw e;
		}
		return entityList;
	}
	
	@Transactional
	@Override
	public Long getAllRowCount(String type) {
		Long count = null;
		try{
			Query query = null;
			if("all".equals(type)){
				query = this.getCurrentSession().createQuery("select count(*) from Movie");
			}
			else{
				query = this.getCurrentSession().createQuery("select count(*) from Movie m where m.type like :type").setParameter("type", "%" + type + "%");
			}
			count = (Long) query.list().get(0);
		}catch(Exception e){
			throw e;
		}
		return count;
	}

	@Override
	public Movie findMovieByName(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findMovieByMovieName(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

}
