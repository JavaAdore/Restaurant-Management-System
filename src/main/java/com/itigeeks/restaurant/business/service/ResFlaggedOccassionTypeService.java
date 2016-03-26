package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResFlaggedOccassionTypeService {


  public void delete(ResFlaggedOccassionType resFlaggedOccassionType);

  public ResFlaggedOccassionType saveOrUpdate(ResFlaggedOccassionType resFlaggedOccassionType);

  public ResFlaggedOccassionType load(Long id);


  public List<ResFlaggedOccassionType> loadAll();


  public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName);


  public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResFlaggedOccassionType> loadAll(Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResFlaggedOccassionType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResFlaggedOccassionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResFlaggedOccassionType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResFlaggedOccassionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
