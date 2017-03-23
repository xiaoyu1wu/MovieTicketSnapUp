package com.wxy.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.wxy.work.dto.UserInfo;
import com.wxy.work.dto.impl.DomainObject;
import com.wxy.work.service.RedisService;

@org.springframework.stereotype.Service("userServicer")
public class RedisUserService implements RedisService<UserInfo>{

	@Autowired
	RedisTemplate<String, DomainObject> redisTemplate;
	
	@Override
	public void put(UserInfo user) {
		redisTemplate.opsForHash().put(user.getObjectKey(), user.getKey(), user);
	}

	@Override
	public UserInfo get(UserInfo key) {
		return (UserInfo) redisTemplate.opsForHash().get(key.getObjectKey(), key.getKey());
	}

	@Override
	public void delete(UserInfo key) {
		redisTemplate.opsForHash().delete(key.getObjectKey(), key.getKey());
	}

}
