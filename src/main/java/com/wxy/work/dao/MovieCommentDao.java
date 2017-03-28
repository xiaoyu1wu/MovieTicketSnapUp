package com.wxy.work.dao;

import java.util.List;

import com.wxy.work.entity.Movie;
import com.wxy.work.entity.MovieComment;

public interface MovieCommentDao extends GenericDao<MovieComment, Integer>{
	
	/**
	 * 根据电影id进行查询
	 */
	List<MovieComment> findMovieCommentByMovieId(Integer movieId);
}
