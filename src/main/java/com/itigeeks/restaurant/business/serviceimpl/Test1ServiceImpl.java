package com.itigeeks.restaurant.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.Test1Service;
import com.itigeeks.restaurant.common.entity.Test;
import com.itigeeks.restaurant.dataaccess.dao.AbstractDAO;

@Service
public class Test1ServiceImpl implements Test1Service{

	@Autowired
	AbstractDAO abstractDAO;
	
	@Override
	public Test saveOrUpdate(Test test) {
		return (Test) abstractDAO.saveOrUpdate(test);
	}

}
