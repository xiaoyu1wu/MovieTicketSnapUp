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
		// TODO Auto-generated method stub
		return screenDao.load(id);
	}

	@Override
	public Screen get(int id) {
		// TODO Auto-generated method stub
		return screenDao.get(id);
	}

	@Override
	public List<Screen> findAll() {
		// TODO Auto-generated method stub
		return screenDao.findAll();
	}

	@Override
	public void persist(Screen entity) {
		// TODO Auto-generated method stub
		screenDao.persist(entity);
	}

	@Override
	public Integer save(Screen entity) {
		// TODO Auto-generated method stub
		return screenDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Screen entity) {
		// TODO Auto-generated method stub
		screenDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		screenDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		screenDao.flush();
	}

	@Override
	public List<Screen> getScreenList(Date day, Integer cinema, String movie) {
		return screenDao.getScreenList(day, cinema, movie);
	}

}
