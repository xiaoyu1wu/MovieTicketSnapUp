package com.wxy.work.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wxy.work.dao.ScreenDao;
import com.wxy.work.entity.Screen;

/**
 * 创建时间：2017-2-24 22:33
 * @author xiaoyu
 * @version 1.0
 *
 */
@Repository("Screen")
public class ScreenDaoImpl implements ScreenDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Screen load(Integer id) {
		
		return (Screen) this.getCurrentSession().load(Screen.class, id);
	}
	
	@Override
	public Screen get(Integer id) {
		return (Screen) this.getCurrentSession().get(Screen.class, id);
	}

	//获取所有的影片排片
	@SuppressWarnings("unchecked")
	@Override
	public List<Screen> findAll() {
		List<Screen> screens = this.getCurrentSession().createQuery("from Screen").setCacheable(true).list();
		return screens;
	}

	@Override
	public void persist(Screen entity) {
		this.getCurrentSession().persist(entity);
	}

	@Override
	public Integer save(Screen entity) {
		return (Integer)this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Screen entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		Screen entity = this.load(id);
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
	public List<Screen> getScreenList(Date day, Integer cinema, String movie) {
		
		/*String sql = "SELECT * from screen_ "
					+ "WHERE movie_name :movie "
					+ "AND cinema_id :cinemaId " 
					+ "AND DATE(open_time) :day"
					+" ;";
		Query query = this.getCurrentSession().createSQLQuery(sql).addEntity(Screen.class);
		List<Screen> pusList = query.setString("movie", movie).setInteger("cinemaId", cinema).setDate("day", day).setCacheable(true).list();
		*/
		
		String sql = "SELECT * from screen "
				+ "WHERE movie_name = ? "
				+ "AND cinema_id = ? "
				+ "AND DATE(open_time) = ?;";
		Query query = this.getCurrentSession().createSQLQuery(sql).addEntity(Screen.class);
		List<Screen> pusList = query.setString(0, movie).setInteger(1, cinema).setDate(2, day).setCacheable(true).list();
		return pusList;
	}
	
}
