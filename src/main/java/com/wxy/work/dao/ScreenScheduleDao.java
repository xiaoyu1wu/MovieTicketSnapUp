package com.wxy.work.dao;

import java.util.Date;
import java.util.List;

import com.wxy.work.entity.ScreenSchedule;

/**
 * 创建时间：2017-2-24 22：29
 * @author xiaoyu
 *
 * 排片表Dao接口
 */
public interface ScreenScheduleDao extends GenericDao<ScreenSchedule, Integer>{

	List<ScreenSchedule> getScreenScheduleList(Date day, Integer cinema, String movie);
	
}
