package com.wxy.work.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wxy.work.dao.MovieCommentDao;
import com.wxy.work.entity.MovieComment;
import com.wxy.work.entity.MovieComment;

@Repository(value="/movieCommentDao")
public class MovieCommentDaoImpl implements MovieCommentDao{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public MovieComment load(Integer id) {
		return (MovieComment) this.getCurrentSession().load(MovieComment.class, id);
	}
	
	@Override
	public MovieComment get(Integer id) {
		return (MovieComment) this.getCurrentSession().get(MovieComment.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovieComment> findAll() {
		List<MovieComment> MovieComments = this.getCurrentSession().createQuery("from MovieComment").setCacheable(true).list();
		return MovieComments;
	}

	@Override
	public void persist(MovieComment entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(MovieComment entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(MovieComment entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		MovieComment entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}
	
	@Transactional
	@Override
	public List<MovieComment> findMovieCommentByMovieId(Integer movieId) {
		List<MovieComment> movies = this.getCurrentSession().createQuery("Select mc from MovieComment mc JOIN mc.movie movie where movie.movieId = :id").setParameter("id", movieId).list();
		return movies;
	}

}
