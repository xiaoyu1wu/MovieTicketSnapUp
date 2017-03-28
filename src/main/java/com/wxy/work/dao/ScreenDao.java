package com.wxy.work.dao;

import java.util.Date;
import java.util.List;

import com.wxy.work.entity.Screen;

/**
 * 创建时间：2017-2-24 22：29
 * @author xiaoyu
 *
 * 排片表Dao接口
 */
public interface ScreenDao extends GenericDao<Screen, Integer>{

	List<Screen> getScreenList(Date day, Integer cinema, String movieName);
	
}
