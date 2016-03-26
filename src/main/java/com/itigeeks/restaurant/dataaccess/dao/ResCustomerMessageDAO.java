package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResCustomerMessageDAO {


  public void delete(ResCustomerMessage resCustomerMessage);

  public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage);

  public ResCustomerMessage load(Long id);

  public List<ResCustomerMessage> loadAll();

  public List<ResCustomerMessage> loadAll(Integer startPage, Integer pageSize);

  public List<ResCustomerMessage> loadByNamedQuery(String queryName);

  public List<ResCustomerMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResCustomerMessage> load(Map<String, Object> criteria);

  public List<ResCustomerMessage> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
