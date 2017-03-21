package com.wxy.work.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.entity.ScreenSchedule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })
public class ScreenScheduleServiceTest {
	private static final Logger LOGGER = Logger.getLogger(ScreenScheduleServiceTest.class);
	
	@Autowired
	private ScreenScheduleService screenScheduleService;
	
	@Test
	public void TestGetScreenScheduleList() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-02-27");
		List<ScreenSchedule> screenList = screenScheduleService.getScreenScheduleList(date, 1, "刺客信条");
		Assert.assertEquals("无法获取电影排片数据", 16, screenList.get(0).getId());
	}
}
