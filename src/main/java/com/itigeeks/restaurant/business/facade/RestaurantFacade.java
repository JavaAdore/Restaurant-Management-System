package com.itigeeks.restaurant.business.facade;


import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.entity.schema.ResUser;

@Service
public interface RestaurantFacade extends Serializable {

	public String test();

	public List<ResUser> loadUsers(PagingDetailsHolder pagingDetailsHolder,
			int startPage, int pageSize);

	public int getCountOfAllUsers();
}
