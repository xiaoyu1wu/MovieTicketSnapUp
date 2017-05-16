package com.wxy.work.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })

public class HallServiceTest {
	private static final Logger LOGGER = Logger
			.getLogger(MovieServiceTest.class);

	@Autowired
	private HallService hallService;
	
	@Test
	public void testGetSeatByHallId(){
		Assert.assertTrue("1_2,2_3,3_4".equals(hallService.getSeatInfo(1, 1).getNoneSeats()));
		Assert.assertTrue(10 == hallService.getSeatInfo(1, 1).getCols());
	}
}
