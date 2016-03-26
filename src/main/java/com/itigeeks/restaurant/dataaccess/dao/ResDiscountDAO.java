package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDiscountDAO {


  public void delete(ResDiscount resDiscount);

  public ResDiscount saveOrUpdate(ResDiscount resDiscount);

  public ResDiscount load(Long id);

  public List<ResDiscount> loadAll();

  public List<ResDiscount> loadAll(Integer startPage, Integer pageSize);

  public List<ResDiscount> loadByNamedQuery(String queryName);

  public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResDiscount> load(Map<String, Object> criteria);

  public List<ResDiscount> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDiscount> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
