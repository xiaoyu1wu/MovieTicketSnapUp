package com.wxy.work.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.util.Page;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })
public class MovieServiceTest {
	private static final Logger LOGGER = Logger
			.getLogger(MovieServiceTest.class);

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieCommentService movieCommentService;
	
	@Test
	public void testQueryForPage(){
		Page page = movieService.queryForPage(0, 10);
		Assert.assertEquals("movieServiceTest出错", 3, page.getList().size());
	}
	
	@Test
	public void testQueryForPageByType(){
		Page page = movieService.queryForPage(0, 10, "奇幻");
		Assert.assertEquals("根据电影类型查询出错movieService.queryForPage（）", 2, page.getList().size());
	}
	
	@Test
	public void testA(){
		Assert.assertEquals("根据电影名查询评论出错", 5, movieCommentService.findMovieComment(1).size());
	}
}
