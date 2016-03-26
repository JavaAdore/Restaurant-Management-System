package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResProductMiscService {


  public void delete(ResProductMisc resProductMisc);

  public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc);

  public ResProductMisc load(Long id);


  public List<ResProductMisc> loadAll();


  public List<ResProductMisc> loadByNamedQuery(String queryName);


  public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResProductMisc> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResProductMisc> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
