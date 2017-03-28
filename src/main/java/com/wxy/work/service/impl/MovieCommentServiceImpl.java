package com.wxy.work.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.MovieCommentDao;
import com.wxy.work.entity.MovieComment;
import com.wxy.work.entity.MovieComment;
import com.wxy.work.service.MovieCommentService;

@Service("/movieCommentService")
public class MovieCommentServiceImpl implements MovieCommentService{

	@Autowired
	private MovieCommentDao movieCommentDao;

	@Override
	public MovieComment load(Integer id) {
		return movieCommentDao.load(id);
	}

	@Override
	public MovieComment get(Integer id) {
		return movieCommentDao.get(id);
	}

	@Override
	public List<MovieComment> findAll() {
		return movieCommentDao.findAll();
	}
 
	@Override
	public void persist(MovieComment entity) {
		movieCommentDao.persist(entity);
	}

	@Override
	public Integer save(MovieComment entity) {
		return movieCommentDao.save(entity);
	}

	@Override
	public void saveOrUpdate(MovieComment entity) {
		movieCommentDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		movieCommentDao.delete(id);
	}

	@Override
	public void flush() {
		movieCommentDao.flush();
	}

	@Override
	public List<MovieComment> findMovieComment(Integer movieId) {
		return movieCommentDao.findMovieCommentByMovieId(movieId);
	}

}
