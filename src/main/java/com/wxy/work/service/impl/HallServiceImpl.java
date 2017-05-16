package com.wxy.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.CinemaDao;
import com.wxy.work.dao.HallDao;
import com.wxy.work.entity.Hall;
import com.wxy.work.service.HallService;

@Service("/hallService")
public class HallServiceImpl implements HallService{

	@Autowired
	private HallDao hallDao;
	
	@Override
	public Hall getSeatInfo(Integer hallId) {
		Hall hall = hallDao.getSeatByHallId(hallId);
		return hall;
	}
	
	@Override
	public Hall getSeatInfo(Integer hallNum, Integer cinemaId) {
		Hall hall = hallDao.getSeatByHallId(hallNum, cinemaId);
		return hall;
	}
}
