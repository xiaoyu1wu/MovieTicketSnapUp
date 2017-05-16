package com.wxy.work.service;

import java.util.List;

import com.wxy.work.entity.Cinema;

public interface CinemaService {
	/**
	 * 
	 * 根据电影院名字进行模糊查询
	 * @param cinemaName
	 * @return
	 */
	List<Cinema> findCinemas(String cinemaName);
	
	/**
	 * 查找所有
	 * @return
	 */
	List<Cinema> findAll();
}
