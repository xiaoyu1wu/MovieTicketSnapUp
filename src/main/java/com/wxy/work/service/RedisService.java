package com.wxy.work.service;

import com.wxy.work.dto.impl.DomainObject;

public interface RedisService<V extends DomainObject> {
	public void put(V obj);
	public V get(V key);
	public void delete(V key);
}
