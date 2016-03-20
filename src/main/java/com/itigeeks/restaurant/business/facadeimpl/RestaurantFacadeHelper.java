package com.itigeeks.restaurant.business.facadeimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.itigeeks.restaurant.business.service.ResUserService;

public class RestaurantFacadeHelper implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired protected ResUserService resUserService;
}
