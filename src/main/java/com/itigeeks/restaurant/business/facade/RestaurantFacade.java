package com.itigeeks.restaurant.business.facade;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.dto.SearchingCriteria;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.sun.javafx.scene.traversal.Direction;

@Service
public interface RestaurantFacade extends Serializable {

  public String test();

  public List<ResUser> loadUsers(PagingDetailsHolder pagingDetailsHolder, int startPage,
      int pageSize);

  public int getCountOfAllUsers();

  public List<ResCustomer> loadCustomers(SearchingCriteria searchingCriteria,
      String[] fieldsToBeDisplayed, PagingDetailsHolder pagingDetailsHolder,
      PagingDirection direction);

  public List<ResVoucher> loadVouchers(ResCustomer currentCustomer, Date startDate, Date endDate,
      PagingDetailsHolder paginDetailsHolder, PagingDirection direction);

  public List<ResVoucher> loadVouchers(ResCustomer currentCustomer,
      PagingDetailsHolder paginDetailsHolder, PagingDirection pagingDirection);

  public ResCustomer saveOrUpdate(ResCustomer currentCustomer);


}
