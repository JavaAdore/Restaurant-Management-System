package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResLog;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResLogService {


  public void delete(ResLog resLog);

  public ResLog saveOrUpdate(ResLog resLog);

  public ResLog load(Long id);


  public List<ResLog> loadAll();


  public List<ResLog> loadByNamedQuery(String queryName);


  public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResLog> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResLog> loadAll(Integer startPage, Integer pageSize);

  public List<ResLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResLog> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResLog> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
