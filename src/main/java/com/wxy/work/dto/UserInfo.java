package com.wxy.work.dto;

import com.wxy.work.dto.impl.DomainObject;

public class UserInfo implements DomainObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8282461702421044344L;

	private static final String OBJECT_KEY = "UserInfo";
	
	private String id;
	private String name;
	
	public UserInfo(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getKey() {
		return getId();
	}

	@Override
	public String getObjectKey() {
		return OBJECT_KEY;
	}
	
}
