package com.wxy.work.enums;

public enum ErrorMsg {
	NotExistUser("用户不存在"),
	AleadyExistUser("用户已存在"),
	NotExistAdmin("管理员不存在"),
	AleadyExistAdmin("管理员已存在"),
	NotCorrectVerifyCode("验证码不正确"), 
	NotMatchPassword("密码不一致");
	
	private String value;
	
	ErrorMsg(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
