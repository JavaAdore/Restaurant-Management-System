package com.itigeeks.restaurant.business.facadeimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.common.entity.schema.ResUser;

@Service
public class RestaurantFacadeImpl extends RestaurantFacadeHelper implements
		RestaurantFacade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	// @Transactional Should be added on all method that modified on the database
	
	@Override
	public String test() {
		List<ResUser> users = resUserService.loadAll();
		
		System.out.println(users.size());
		System.out.println(users);
		return "";
	}

}
