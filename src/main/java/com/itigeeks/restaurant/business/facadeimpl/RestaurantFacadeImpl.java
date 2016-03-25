package com.itigeeks.restaurant.business.facadeimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.business.service.ResCustomerService;
import com.itigeeks.restaurant.business.service.ResUserService;
import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.dto.SearchingCriteria;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.PagingDirection;

@Service
public class RestaurantFacadeImpl implements RestaurantFacade {

	@Autowired
	protected ResUserService resUserService;

	@Autowired
	protected ResCustomerService resCustomerService;

	private static final long serialVersionUID = 1L;

	// @Transactional Should be added on all method that modified on the
	// database

	@Override
	public String test() {
		List<ResUser> users = resUserService.loadAll();

		System.out.println(users.size());
		System.out.println(users);
		return "";
	}

	@Override
	public List<ResUser> loadUsers(PagingDetailsHolder pagingDetailsHolder,
			int startPage, int pageSize) {
		return resUserService.loadAll(startPage, pageSize);

	}

	@Override
	public int getCountOfAllUsers() {
		return resUserService.countAll();
	}

	@Override
	public List<ResCustomer> loadCustomers(SearchingCriteria searchingCriteria,
			PagingDetailsHolder pagingDetailsHolder, PagingDirection direction) {
		Map<String, Object> criteria = searchingCriteria.prepareSearchingCriteria(ResCustomer.class);
		
		int numberOfAllResults = resCustomerService.getCount(criteria);
		
		pagingDetailsHolder.adjustStartResultToMatchDirection(numberOfAllResults, direction);
		
		List<ResCustomer> customers = resCustomerService.load(criteria,pagingDetailsHolder.getStartResult(),pagingDetailsHolder.getPageSize());
		
		return customers;

	}

}
