package com.itigeeks.restaurant.business.facadeimpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.business.service.ResCustomerService;
import com.itigeeks.restaurant.business.service.ResUserService;
import com.itigeeks.restaurant.business.service.ResVoucherService;
import com.itigeeks.restaurant.common.dto.CustomCriteria;
import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.dto.SearchingCriteria;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.itigeeks.restaurant.common.utils.Utils;
import com.sun.javafx.scene.traversal.Direction;

@Service
public class RestaurantFacadeImpl implements RestaurantFacade {

  private static final long serialVersionUID = 1L;

  
  @Autowired
  protected ResUserService resUserService;

  @Autowired
  protected ResCustomerService resCustomerService;
  
  @Autowired
  protected ResVoucherService resVoucherService;

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
  public List<ResUser> loadUsers(PagingDetailsHolder pagingDetailsHolder, int startPage,
      int pageSize) {
    return resUserService.loadAll(startPage, pageSize);

  }

  @Override
  public int getCountOfAllUsers() {
    return resUserService.countAll();
  }

  @Override
  public List<ResCustomer> loadCustomers(SearchingCriteria searchingCriteria,
      String[] fieldsToBeDisplayed, PagingDetailsHolder pagingDetailsHolder,
      PagingDirection direction) {

    Map<String, Object> criteria =
        searchingCriteria.prepareSearchingCriteria(ResCustomer.class, fieldsToBeDisplayed);

    int numberOfAllResults = resCustomerService.getCountOfWithAnyCriteria(criteria);

    pagingDetailsHolder.adjustStartResultToMatchDirection(numberOfAllResults, direction);

    List<ResCustomer> customers =
        resCustomerService.loadWithAnyCriteria(criteria, pagingDetailsHolder.getStartResult(),
            pagingDetailsHolder.getPageSize());

    return customers;
  }



  @Override
  public List<ResVoucher> loadVouchers(ResCustomer currentCustomer, Date startDate, Date endDate,
      PagingDetailsHolder paginDetailsHolder, PagingDirection direction) {
    startDate = Utils.getStartOfDay(startDate);
    endDate = Utils.getStartOfDay(endDate);
   
    CustomCriteria startDateCritera = new CustomCriteria(startDate , CustomCriteria.Criteria.GREATER_THAN_OR_EQUAL);
    CustomCriteria endDateCritera = new CustomCriteria(endDate , CustomCriteria.Criteria.LESS_THAN_OR_EQUAL);
    
    Map<String,Object> criteria = new HashMap<String,Object>();
    criteria.put("resCustomer", currentCustomer);
    criteria.put("validFrom" , startDateCritera);
    criteria.put("validTill" , endDateCritera);

    int numberOfAllResults = resVoucherService.getCountOfAllCriteria(criteria);
      
    paginDetailsHolder.adjustStartResultToMatchDirection(numberOfAllResults, direction);
   
    List<ResVoucher> vouchers = resVoucherService.loadWithAllCriteria(criteria, paginDetailsHolder.getStartResult(), paginDetailsHolder.getPageSize());
    
    return vouchers;
  }

  @Override
  public List<ResVoucher> loadVouchers(ResCustomer currentCustomer,
      PagingDetailsHolder paginDetailsHolder, PagingDirection pagingDirection) {
    
    Map<String,Object> criteria = new HashMap<String,Object>();
    criteria.put("resCustomer", currentCustomer);

    int numberOfAllResults = resVoucherService.getCountOfAllCriteria(criteria);
      
    paginDetailsHolder.adjustStartResultToMatchDirection(numberOfAllResults, pagingDirection);
   
    List<ResVoucher> vouchers = resVoucherService.loadWithAllCriteria(criteria, paginDetailsHolder.getStartResult(), paginDetailsHolder.getPageSize());
    
    return vouchers;
  }

  



}
