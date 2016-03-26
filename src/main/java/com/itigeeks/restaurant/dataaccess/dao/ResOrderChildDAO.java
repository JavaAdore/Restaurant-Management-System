package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResOrderChildDAO {


  public void delete(ResOrderChild resOrderChild);

  public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild);

  public ResOrderChild load(Long id);

  public List<ResOrderChild> loadAll();

  public List<ResOrderChild> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderChild> loadByNamedQuery(String queryName);

  public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResOrderChild> load(Map<String, Object> criteria);

  public List<ResOrderChild> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResOrderChild> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
