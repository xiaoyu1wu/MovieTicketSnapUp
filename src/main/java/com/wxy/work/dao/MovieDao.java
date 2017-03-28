package com.wxy.work.dao;

import java.util.List;

import com.wxy.work.entity.Movie;
import com.wxy.work.entity.User;

public interface MovieDao extends GenericDao<Movie, Integer> {
	/**
	 * 分页查询
	 * @param offset 开始索引
	 * @param length 数据长度
	 * @return 
	 */
	List<Movie> queryForPage(int offset, int length);

	/**
	 * 对类型进行分页查询
	 * @param offset	开始索引
	 * @param length	长度
	 * @param type 电影类型
	 * @return
	 */
	List<Movie> queryForPage(int offset, int length, String type);

	/**
	 * 查询所有的记录数
	 * @return
	 */
	Long getAllRowCount(String type);
	
	/**
	 * 根据电影名进行精确搜索
	 * @param movieName
	 * @return
	 */
	Movie findMovieByName(String movieName);
	
	/**
	 * 根据电影名进行模糊搜索
	 * @param movieName
	 * @return
	 */
	List<Movie> findMovieByMovieName(String movieName);
	
	
}
