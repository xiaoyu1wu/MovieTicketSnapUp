package com.wxy.work.service;

import java.util.Date;
import java.util.List;

import com.wxy.work.entity.ScreenSchedule;

public interface ScreenScheduleService {
	ScreenSchedule load(int id);
	
	ScreenSchedule get(int id);
	
	List<ScreenSchedule> findAll();
	
	void persist(ScreenSchedule entity);
	
	Integer save(ScreenSchedule entity);
	
	void saveOrUpdate(ScreenSchedule entity);
	
	void delete(int id);
	
	void flush();
	
	List<ScreenSchedule> getScreenScheduleList(Date day, Integer cinema, String movie);
}
