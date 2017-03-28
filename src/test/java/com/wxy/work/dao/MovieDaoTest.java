package com.wxy.work.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.entity.Movie;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })

public class MovieDaoTest {
	private static final Logger LOGGER = Logger
			.getLogger(MovieDaoTest.class);

	@Autowired
	private MovieDao movieDao;
	
	@Test
	public void testQueryForPage(){
		List<Movie> movies = movieDao.queryForPage(0, 5, "动作");
		Assert.assertEquals("刺客信条", movies.get(0).getMovieName());
		Assert.assertEquals("生化危机：终章", movies.get(1).getMovieName());
		Assert.assertEquals("金刚：骷髅岛", movies.get(2).getMovieName());
		Assert.assertEquals(3, movies.size());
	}
	
	@Test
	public void testGetAllRowCount(){
		Assert.assertEquals("获取电影类型记录总数出错", new Long(3), movieDao.getAllRowCount("动作"));
	}
}
