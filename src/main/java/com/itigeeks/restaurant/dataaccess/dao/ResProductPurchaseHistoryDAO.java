package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductPurchaseHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResProductPurchaseHistoryDAO {


  public void delete(ResProductPurchaseHistory resProductPurchaseHistory);

  public ResProductPurchaseHistory saveOrUpdate(ResProductPurchaseHistory resProductPurchaseHistory);

  public ResProductPurchaseHistory load(Long id);

  public List<ResProductPurchaseHistory> loadAll();

  public List<ResProductPurchaseHistory> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName);

  public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria);

  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
