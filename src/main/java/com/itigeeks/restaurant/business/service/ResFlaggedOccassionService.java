package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResFlaggedOccassionService {


  public void delete(ResFlaggedOccassion resFlaggedOccassion);

  public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion);

  public ResFlaggedOccassion load(Long id);


  public List<ResFlaggedOccassion> loadAll();


  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName);


  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResFlaggedOccassion> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResFlaggedOccassion> loadAll(Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
