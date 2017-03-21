package com.wxy.work.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxy.work.dao.ScreenScheduleDao;
import com.wxy.work.entity.ScreenSchedule;
import com.wxy.work.service.ScreenScheduleService;

@Service("screenScheduleService")
public class ScreenScheduleServiceImpl implements ScreenScheduleService{

	@Autowired
	private ScreenScheduleDao screenScheduleDao;
	
	@Override
	public ScreenSchedule load(int id) {
		// TODO Auto-generated method stub
		return screenScheduleDao.load(id);
	}

	@Override
	public ScreenSchedule get(int id) {
		// TODO Auto-generated method stub
		return screenScheduleDao.get(id);
	}

	@Override
	public List<ScreenSchedule> findAll() {
		// TODO Auto-generated method stub
		return screenScheduleDao.findAll();
	}

	@Override
	public void persist(ScreenSchedule entity) {
		// TODO Auto-generated method stub
		screenScheduleDao.persist(entity);
	}

	@Override
	public Integer save(ScreenSchedule entity) {
		// TODO Auto-generated method stub
		return screenScheduleDao.save(entity);
	}

	@Override
	public void saveOrUpdate(ScreenSchedule entity) {
		// TODO Auto-generated method stub
		screenScheduleDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		screenScheduleDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		screenScheduleDao.flush();
	}

	@Override
	public List<ScreenSchedule> getScreenScheduleList(Date day, Integer cinema, String movie) {
		return screenScheduleDao.getScreenScheduleList(day, cinema, movie);
	}

}
