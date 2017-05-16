package com.wxy.work.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.CinemaDao;
import com.wxy.work.entity.Cinema;
import com.wxy.work.service.CinemaService;

@Service("/cinemaService")
public class CinemaServiceImpl implements CinemaService{
	@Autowired
	private CinemaDao cinemaDao;

	@Override
	public List<Cinema> findCinemas(String cinemaName) {
		return cinemaDao.findByLikeName(cinemaName);
	}

	@Override
	public List<Cinema> findAll() {
		return cinemaDao.findAll();
	}
	
	
}
