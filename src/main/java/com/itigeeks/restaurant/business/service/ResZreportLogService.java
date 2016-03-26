package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResZreportLogService {


  public void delete(ResZreportLog resZreportLog);

  public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog);

  public ResZreportLog load(Long id);


  public List<ResZreportLog> loadAll();


  public List<ResZreportLog> loadByNamedQuery(String queryName);


  public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResZreportLog> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResZreportLog> loadAll(Integer startPage, Integer pageSize);

  public List<ResZreportLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
