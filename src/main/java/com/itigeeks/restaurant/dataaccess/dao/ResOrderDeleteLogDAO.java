package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderDeleteLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResOrderDeleteLogDAO {


  public void delete(ResOrderDeleteLog resOrderDeleteLog);

  public ResOrderDeleteLog saveOrUpdate(ResOrderDeleteLog resOrderDeleteLog);

  public ResOrderDeleteLog load(Long id);

  public List<ResOrderDeleteLog> loadAll();

  public List<ResOrderDeleteLog> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderDeleteLog> loadByNamedQuery(String queryName);

  public List<ResOrderDeleteLog> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResOrderDeleteLog> load(Map<String, Object> criteria);

  public List<ResOrderDeleteLog> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
