package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResAddon;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResAddonService {


  public void delete(ResAddon resAddon);

  public ResAddon saveOrUpdate(ResAddon resAddon);

  public ResAddon load(Long id);


  public List<ResAddon> loadAll();


  public List<ResAddon> loadByNamedQuery(String queryName);


  public List<ResAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResAddon> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResAddon> loadAll(Integer startPage, Integer pageSize);

  public List<ResAddon> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
