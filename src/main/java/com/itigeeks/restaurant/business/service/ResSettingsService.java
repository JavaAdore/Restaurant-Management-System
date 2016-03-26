package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResSettings;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResSettingsService {


  public void delete(ResSettings resSettings);

  public ResSettings saveOrUpdate(ResSettings resSettings);

  public ResSettings load(Long id);


  public List<ResSettings> loadAll();


  public List<ResSettings> loadByNamedQuery(String queryName);


  public List<ResSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResSettings> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResSettings> loadAll(Integer startPage, Integer pageSize);

  public List<ResSettings> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResSettings> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResSettings> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResSettings> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResSettings> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResSettings> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResSettings> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
