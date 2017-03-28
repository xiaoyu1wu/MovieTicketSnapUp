package com.wxy.work.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wxy.work.dao.MovieDao;
import com.wxy.work.entity.Movie;
import com.wxy.work.service.MovieService;
import com.wxy.work.util.Page;

@Service("/movieService")
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieDao movieDao;

	@Override
    public Page queryForPage(int currentPage, int pageSize) {

        Page page = new Page();        
        //总记录数
        int allRow = movieDao.getAllRowCount("all").intValue();
        //当前页开始记录
        Integer offset = page.countOffset(currentPage,pageSize);  
        //分页查询结果集
        List<Movie> list = movieDao.queryForPage(offset, pageSize); 

        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);
        
        return page;
    }

	@Override
	public Movie findMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page queryForPage(int currentPage, int pageSize, String movieType) {
		Page page = new Page();        
        //总记录数
        int allRow = movieDao.getAllRowCount("all").intValue();
        //当前页开始记录
        Integer offset = page.countOffset(currentPage,pageSize);  
        //分页查询结果集
        List<Movie> list = movieDao.queryForPage(offset, pageSize, movieType); 

        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setTotalRecords(allRow);
        page.setList(list);
        
        return page;
	}

	@Override
	public Movie findMovie(Integer movieId) {
		return movieDao.get(movieId);
	}
}