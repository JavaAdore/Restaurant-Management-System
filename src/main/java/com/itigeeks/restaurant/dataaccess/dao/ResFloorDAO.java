package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFloor;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResFloorDAO {


  public void delete(ResFloor resFloor);

  public ResFloor saveOrUpdate(ResFloor resFloor);

  public ResFloor load(Long id);

  public List<ResFloor> loadAll();

  public List<ResFloor> loadAll(Integer startPage, Integer pageSize);

  public List<ResFloor> loadByNamedQuery(String queryName);

  public List<ResFloor> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResFloor> load(Map<String, Object> criteria);

  public List<ResFloor> load(Map<String, Object> criteria, QueryConjunctionType queryConjunctionType);

  public List<ResFloor> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResFloor> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResFloor> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
