package com.wxy.work.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wxy.work.dao.ScreenScheduleDao;
import com.wxy.work.entity.ScreenSchedule;

/**
 * 创建时间：2017-2-24 22:33
 * @author xiaoyu
 * @version 1.0
 *
 */
@Repository("ScreenSchedule")
public class ScreenScheduleDaoImpl implements ScreenScheduleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public ScreenSchedule load(Integer id) {
		
		return (ScreenSchedule) this.getCurrentSession().load(ScreenSchedule.class, id);
	}
	
	@Override
	public ScreenSchedule get(Integer id) {
		return (ScreenSchedule) this.getCurrentSession().get(ScreenSchedule.class, id);
	}

	//获取所有的影片排片
	@SuppressWarnings("unchecked")
	@Override
	public List<ScreenSchedule> findAll() {
		List<ScreenSchedule> screenSchedules = this.getCurrentSession().createQuery("from ScreenSchedule").setCacheable(true).list();
		return screenSchedules;
	}

	@Override
	public void persist(ScreenSchedule entity) {
		this.getCurrentSession().persist(entity);
	}

	@Override
	public Integer save(ScreenSchedule entity) {
		return (Integer)this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(ScreenSchedule entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		ScreenSchedule entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();
	}

	/**
	 * 根据电影名、影院id、天， 获取排片列表
	 */
	@Override
	public List<ScreenSchedule> getScreenScheduleList(Date day, Integer cinema, String movie) {
		
		/*String sql = "SELECT * from screen_schedule "
					+ "WHERE movie_name :movie "
					+ "AND cinema_id :cinemaId " 
					+ "AND DATE(open_time) :day"
					+" ;";
		Query query = this.getCurrentSession().createSQLQuery(sql).addEntity(ScreenSchedule.class);
		List<ScreenSchedule> pusList = query.setString("movie", movie).setInteger("cinemaId", cinema).setDate("day", day).setCacheable(true).list();
		*/
		
		String sql = "SELECT * from screen_schedule "
				+ "WHERE movie_name = ? "
				+ "AND cinema_id = ? "
				+ "AND DATE(open_time) = ?;";
		Query query = this.getCurrentSession().createSQLQuery(sql).addEntity(ScreenSchedule.class);
		List<ScreenSchedule> pusList = query.setString(0, movie).setInteger(1, cinema).setDate(2, day).setCacheable(true).list();
		return pusList;
	}
	
}
