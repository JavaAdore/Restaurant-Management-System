package com.itigeeks.restaurant.business.facadeimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.business.service.Test1Service;
import com.itigeeks.restaurant.business.service.Test2Service;
import com.itigeeks.restaurant.common.entity.Test;
import com.itigeeks.restaurant.common.entity.Test2;

@Service
public class RestaurantFacadeImpl implements RestaurantFacade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	Test1Service test1Service;

	@Autowired
	Test2Service test2Service;

	@Transactional
	public String test() {
		try
		{
			test1Service.saveOrUpdate(new Test());
			test2Service.saveOrUpdate(new Test2());
		}catch(Exception ex)
		{
			throw new RuntimeException("Sama hooooooooooooooooooos the catched exception here");
			
		}
		return "";
	}

}
