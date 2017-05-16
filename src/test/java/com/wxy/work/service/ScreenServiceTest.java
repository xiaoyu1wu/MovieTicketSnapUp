package com.wxy.work.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.entity.Hall;
import com.wxy.work.entity.Screen;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })
public class ScreenServiceTest extends TestCase{
	private static final Logger LOGGER = Logger.getLogger(ScreenServiceTest.class);
	
	@Autowired
	private ScreenService screenService;
	
	@Test
	public void TestGetScreenList() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-03-27");
		List<Screen> screenList = screenService.getScreenList(date, 1, "刺客信条");
		System.out.println("screenId:" + screenList.size()); 
	}
	
	@Test
	public void TestGet() throws ParseException{
		Screen screen = screenService.get(1);
		System.out.println("行数:" + screen.getHall().getCols()); 
	}
}
