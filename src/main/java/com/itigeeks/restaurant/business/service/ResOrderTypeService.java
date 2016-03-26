package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResOrderTypeService {


  public void delete(ResOrderType resOrderType);

  public ResOrderType saveOrUpdate(ResOrderType resOrderType);

  public ResOrderType load(Long id);


  public List<ResOrderType> loadAll();


  public List<ResOrderType> loadByNamedQuery(String queryName);


  public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResOrderType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResOrderType> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResOrderType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResOrderType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResOrderType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResOrderType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
