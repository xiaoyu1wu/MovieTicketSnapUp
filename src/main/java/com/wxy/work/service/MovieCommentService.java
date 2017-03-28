package com.wxy.work.service;

import java.util.List;

import com.wxy.work.entity.MovieComment;

public interface MovieCommentService {
	MovieComment load(Integer id);

	MovieComment get(Integer id);

	List<MovieComment> findAll();

	void persist(MovieComment entity);

	Integer save(MovieComment entity);

	void saveOrUpdate(MovieComment entity);

	void delete(Integer id);

	void flush();

	List<MovieComment> findMovieComment(Integer movieId);

}
