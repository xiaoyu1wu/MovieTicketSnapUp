package com.wxy.work.service;

import java.util.Date;
import java.util.List;

import com.wxy.work.entity.Screen;

public interface ScreenService {
	Screen load(int id);
	
	Screen get(int id);
	
	List<Screen> findAll();
	
	void persist(Screen entity);
	
	Integer save(Screen entity);
	
	void saveOrUpdate(Screen entity);
	
	void delete(int id);
	
	void flush();
	
	List<Screen> getScreenList(Date day, Integer cinema, String movie);
}
