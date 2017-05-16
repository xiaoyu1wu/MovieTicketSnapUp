package com.wxy.work.service;

import com.wxy.work.entity.Hall;

public interface HallService {

	Hall getSeatInfo(Integer hallId);
	
	Hall getSeatInfo(Integer hallNum, Integer cinemaId);
}
