package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResTable;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResTableService {


  public void delete(ResTable resTable);

  public ResTable saveOrUpdate(ResTable resTable);

  public ResTable load(Long id);


  public List<ResTable> loadAll();


  public List<ResTable> loadByNamedQuery(String queryName);


  public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResTable> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResTable> loadAll(Integer startPage, Integer pageSize);

  public List<ResTable> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
