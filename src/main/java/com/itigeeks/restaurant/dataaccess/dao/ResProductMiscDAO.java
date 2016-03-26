package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResProductMiscDAO {


  public void delete(ResProductMisc resProductMisc);

  public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc);

  public ResProductMisc load(Long id);

  public List<ResProductMisc> loadAll();

  public List<ResProductMisc> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductMisc> loadByNamedQuery(String queryName);

  public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResProductMisc> load(Map<String, Object> criteria);

  public List<ResProductMisc> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResProductMisc> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
