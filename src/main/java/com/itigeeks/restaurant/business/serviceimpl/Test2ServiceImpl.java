package com.itigeeks.restaurant.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.Test2Service;
import com.itigeeks.restaurant.common.entity.Test;
import com.itigeeks.restaurant.common.entity.Test2;
import com.itigeeks.restaurant.dataaccess.dao.AbstractDAO;

@Service
public class Test2ServiceImpl implements Test2Service {

	@Autowired
	AbstractDAO abstractDAO;

	@Override
	public Test2 saveOrUpdate(Test2 test) {
	
		return (Test2) abstractDAO.saveOrUpdate(test);
	}

}
