package com.itigeeks.restaurant.business.facade;


import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.dto.SearchingCriteria;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.PagingDirection;

@Service
public interface RestaurantFacade extends Serializable {

	public String test();

	public List<ResUser> loadUsers(PagingDetailsHolder pagingDetailsHolder,
			int startPage, int pageSize);

	public int getCountOfAllUsers();

	public List<ResCustomer> loadCustomers(SearchingCriteria searchingCriteria,
			PagingDetailsHolder pagingDetailsHolder, PagingDirection direction);

	
}
