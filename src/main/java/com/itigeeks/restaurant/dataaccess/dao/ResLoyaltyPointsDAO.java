package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResLoyaltyPointsDAO {


  public void delete(ResLoyaltyPoints resLoyaltyPoints);

  public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints);

  public ResLoyaltyPoints load(Long id);

  public List<ResLoyaltyPoints> loadAll();

  public List<ResLoyaltyPoints> loadAll(Integer startPage, Integer pageSize);

  public List<ResLoyaltyPoints> loadByNamedQuery(String queryName);

  public List<ResLoyaltyPoints> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
