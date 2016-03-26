package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResUserDAO {


  public void delete(ResUser resUser);

  public ResUser saveOrUpdate(ResUser resUser);

  public ResUser load(Long id);

  public List<ResUser> loadAll();

  public List<ResUser> loadAll(Integer startPage, Integer pageSize);

  public List<ResUser> loadByNamedQuery(String queryName);

  public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResUser> load(Map<String, Object> criteria);

  public List<ResUser> load(Map<String, Object> criteria, QueryConjunctionType queryConjunctionType);

  public List<ResUser> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
