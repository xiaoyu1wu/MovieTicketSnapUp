package com.wxy.work.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.enums.DateStyle;
import com.wxy.work.util.DateUtil;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-redis.xml",
		"classpath:spring-hibernate.xml" })
public class CommonTest {
	
	/**
	 * 测试时间工具类
	 * @param args
	 */
	@Test
	public void testDateUtil() {
		String time = DateUtil.DateToString(new Date("2017/3/21 20:25:48"), DateStyle.HH_MM_SS);
		Assert.assertEquals("20:25:48", time);
	}
}
