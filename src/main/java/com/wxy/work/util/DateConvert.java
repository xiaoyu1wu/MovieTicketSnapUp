package com.wxy.work.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.taglibs.standard.lang.jstl.parser.ParseException;
import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date>{

	@Override
	public Date convert(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(strDate);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
