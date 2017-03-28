package com.wxy.work.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxy.work.service.UserService;
import com.wxy.work.service.UserServiceTest;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })

public class UserDaoTest {
	private static final Logger LOGGER = Logger
			.getLogger(UserDaoTest.class);

	@Autowired
	private UserDao userDao;
	
	@Test
	public void save() {
		Assert.assertEquals(17, userDao.findUser("13@qq.com"));
	}
}
