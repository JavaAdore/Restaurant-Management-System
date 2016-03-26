package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCardType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResCardTypeDAO {


  public void delete(ResCardType resCardType);

  public ResCardType saveOrUpdate(ResCardType resCardType);

  public ResCardType load(Long id);

  public List<ResCardType> loadAll();

  public List<ResCardType> loadAll(Integer startPage, Integer pageSize);

  public List<ResCardType> loadByNamedQuery(String queryName);

  public List<ResCardType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResCardType> load(Map<String, Object> criteria);

  public List<ResCardType> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResCardType> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResCardType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResCardType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
