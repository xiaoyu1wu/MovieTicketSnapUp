package com.wxy.work.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.wxy.work.dto.User;
import com.wxy.work.entity.AcctUser;
import com.wxy.work.service.UserService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

/**
 * 创建时间：2015-2-6 下午3:31:07
 * 
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
									"classpath:spring-redis.xml",
									"classpath:spring-hibernate.xml" })
public class UserServiceTest {

	private static final Logger LOGGER = Logger
			.getLogger(UserServiceTest.class);

	@Autowired
	private UserService userService;
	
	@Autowired
	private RedisService<User> redisService;

	/*@Test
	public void save() {
		AcctUser acctUser = new AcctUser();
		acctUser.setId(UUID.randomUUID().toString());
		acctUser.setNickName("test");
		acctUser.setRegisterTime(new Date());
		acctUser.setTelephone("13022221111");
		String id = userService.save(acctUser);
		LOGGER.info(JSON.toJSONString(id));
	}*/
	
	/**
	 * 测试redis是否可用
	 */
	@Test
	public void testRedis(){
		User user1 = new User("tony1Key", "wuxiaoyu");
        User user2 = new User("tony2Key", "wuxiaoning");
        
        //先删除存在的
        if(redisService.get(user1) != null && redisService.get(user2) != null){
        	redisService.delete(user1);
        	redisService.delete(user2);
        	
        }
        
        System.out.println("==== 获取数据  ====");
        System.out.println("User is not in redis yet: " + redisService.get(user1));
        System.out.println("User is not in redis yet: " + redisService.get(user2));
        
        System.out.println("==== 新增 ====");
        redisService.put(user1);
        redisService.put(user2);
       
        System.out.println("User in redis yet: " + redisService.get(new User("tony1Key", "")).getName());
        System.out.println("User in redis yet: " + redisService.get(new User("tony2Key", "")).getName());
	}

}