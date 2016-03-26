package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResButtonPermissionTypeService {


  public void delete(ResButtonPermissionType resButtonPermissionType);

  public ResButtonPermissionType saveOrUpdate(ResButtonPermissionType resButtonPermissionType);

  public ResButtonPermissionType load(Long id);


  public List<ResButtonPermissionType> loadAll();


  public List<ResButtonPermissionType> loadByNamedQuery(String queryName);


  public List<ResButtonPermissionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResButtonPermissionType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResButtonPermissionType> loadAll(Integer startPage, Integer pageSize);

  public List<ResButtonPermissionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
