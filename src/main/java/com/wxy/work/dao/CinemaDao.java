package com.wxy.work.dao;

import java.util.List;

import com.wxy.work.entity.Cinema;
import com.wxy.work.entity.MovieComment;

public interface CinemaDao extends GenericDao<Cinema, Integer>{
	/**
	 * 通过名字查找电影院
	 * @param name
	 * @return
	 */
	Cinema findByName(String name);

	/**
	 * 通过名字模糊查找电影院
	 * @param name
	 * @return
	 */
	List<Cinema> findByLikeName(String name);
}
