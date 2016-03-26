package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResOrderActionTypeService {


  public void delete(ResOrderActionType resOrderActionType);

  public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType);

  public ResOrderActionType load(Long id);


  public List<ResOrderActionType> loadAll();


  public List<ResOrderActionType> loadByNamedQuery(String queryName);


  public List<ResOrderActionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResOrderActionType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResOrderActionType> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderActionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
