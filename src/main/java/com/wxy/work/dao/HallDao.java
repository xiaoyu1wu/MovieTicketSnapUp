package com.wxy.work.dao;

import com.wxy.work.entity.Cinema;
import com.wxy.work.entity.Hall;

public interface HallDao extends GenericDao<Hall, Integer>{

	/**
	 * 根据自增主键获取座位信息
	 * @param hallId
	 * @return
	 */
	Hall getSeatByHallId(Integer hallId);

	/**
	 * 根据电影号，大厅号获取座位信息
	 * @param hallNum
	 * @return
	 */
	Hall getSeatByHallId(Integer hallNum, Integer cinemaId);
	
}
