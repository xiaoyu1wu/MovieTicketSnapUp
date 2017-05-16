package com.wxy.work.dao;

import com.wxy.work.entity.Admin;
import com.wxy.work.entity.MovieComment;

public interface AdminDao extends GenericDao<Admin, Integer>{

	Admin findAdmin(Admin admin);

}
