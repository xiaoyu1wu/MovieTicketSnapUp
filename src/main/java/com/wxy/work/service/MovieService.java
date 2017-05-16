package com.wxy.work.service;

import java.util.List;

import com.wxy.work.entity.Movie;
import com.wxy.work.util.Page;

public interface MovieService {
	
	/**
	 * 分页查询
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	Page queryForPage(int currentPage, int pageSize);
	
	/**
	 * 分页查询
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	Page queryForPage(int currentPage, int pageSize, String movieType);
	
	/**
	 * 根据电影名搜索电影
	 * @param movieName
	 * @return
	 */
	List<Movie> findMovie(String movieName);
	
	/**
	 * 根据电影id查找
	 * @param movieId
	 * @return
	 */
	Movie findMovie(Integer movieId);
}