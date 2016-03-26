package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResState;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResStateDAO {


  public void delete(ResState resState);

  public ResState saveOrUpdate(ResState resState);

  public ResState load(Long id);

  public List<ResState> loadAll();

  public List<ResState> loadAll(Integer startPage, Integer pageSize);

  public List<ResState> loadByNamedQuery(String queryName);

  public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResState> load(Map<String, Object> criteria);

  public List<ResState> load(Map<String, Object> criteria, QueryConjunctionType queryConjunctionType);

  public List<ResState> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
