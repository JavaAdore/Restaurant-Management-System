package com.itigeeks.restaurant.business.facade;


import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public interface RestaurantFacade extends Serializable {

	public String test();
}
