package com.wxy.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.wxy.work.dto.User;
import com.wxy.work.dto.impl.DomainObject;
import com.wxy.work.service.RedisService;

@org.springframework.stereotype.Service("userServicer")
public class RedisUserService implements RedisService<User>{

	@Autowired
	RedisTemplate<String, DomainObject> redisTemplate;
	
	@Override
	public void put(User user) {
		redisTemplate.opsForHash().put(user.getObjectKey(), user.getKey(), user);
	}

	@Override
	public User get(User key) {
		return (User) redisTemplate.opsForHash().get(key.getObjectKey(), key.getKey());
	}

	@Override
	public void delete(User key) {
		redisTemplate.opsForHash().delete(key.getObjectKey(), key.getKey());
	}

}
