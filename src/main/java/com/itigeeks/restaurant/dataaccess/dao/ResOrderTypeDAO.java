package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResOrderTypeDAO {


  public void delete(ResOrderType resOrderType);

  public ResOrderType saveOrUpdate(ResOrderType resOrderType);

  public ResOrderType load(Long id);

  public List<ResOrderType> loadAll();

  public List<ResOrderType> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderType> loadByNamedQuery(String queryName);

  public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResOrderType> load(Map<String, Object> criteria);

  public List<ResOrderType> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResOrderType> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
