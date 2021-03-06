package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResCustomerAddressDAO {


  public void delete(ResCustomerAddress resCustomerAddress);

  public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress);

  public ResCustomerAddress load(Long id);

  public List<ResCustomerAddress> loadAll();

  public List<ResCustomerAddress> loadAll(Integer startPage, Integer pageSize);

  public List<ResCustomerAddress> loadByNamedQuery(String queryName);

  public List<ResCustomerAddress> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResCustomerAddress> load(Map<String, Object> criteria);

  public List<ResCustomerAddress> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
