package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResProductWasteHistoryService {


  public void delete(ResProductWasteHistory resProductWasteHistory);

  public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory);

  public ResProductWasteHistory load(Long id);


  public List<ResProductWasteHistory> loadAll();


  public List<ResProductWasteHistory> loadByNamedQuery(String queryName);


  public List<ResProductWasteHistory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResProductWasteHistory> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResProductWasteHistory> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductWasteHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
