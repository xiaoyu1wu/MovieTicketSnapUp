package com.wxy.work.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.ScreenDao;
import com.wxy.work.entity.Screen;
import com.wxy.work.service.ScreenService;

@Service("screenService")
public class ScreenServiceImpl implements ScreenService{

	@Autowired
	private ScreenDao screenDao;
	
	@Override
	public Screen load(int id) {
		return screenDao.load(id);
	}

	@Override
	public Screen get(int id) {
		return screenDao.get(id);
	}

	@Override
	public List<Screen> findAll() {
		return screenDao.findAll();
	}

	@Override
	public void persist(Screen entity) {
		screenDao.persist(entity);
	}

	@Override
	public Integer save(Screen entity) {
		return screenDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Screen entity) {
		screenDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(int id) {
		screenDao.delete(id);
	}

	@Override
	public void flush() {
		screenDao.flush();
	}

	@Override
	public List<Screen> getScreenList(Date day, Integer cinema, String movieName) {
		return screenDao.getScreenList(day, cinema, movieName);
	}

}
