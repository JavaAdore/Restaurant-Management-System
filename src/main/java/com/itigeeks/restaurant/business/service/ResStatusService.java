package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResStatus;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResStatusService {


  public void delete(ResStatus resStatus);

  public ResStatus saveOrUpdate(ResStatus resStatus);

  public ResStatus load(Long id);


  public List<ResStatus> loadAll();


  public List<ResStatus> loadByNamedQuery(String queryName);


  public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResStatus> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResStatus> loadAll(Integer startPage, Integer pageSize);

  public List<ResStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResStatus> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResStatus> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResStatus> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResStatus> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResStatus> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResStatus> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
