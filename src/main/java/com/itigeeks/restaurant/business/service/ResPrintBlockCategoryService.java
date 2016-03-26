package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlockCategory;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResPrintBlockCategoryService {


  public void delete(ResPrintBlockCategory resPrintBlockCategory);

  public ResPrintBlockCategory saveOrUpdate(ResPrintBlockCategory resPrintBlockCategory);

  public ResPrintBlockCategory load(Long id);


  public List<ResPrintBlockCategory> loadAll();


  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName);


  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResPrintBlockCategory> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResPrintBlockCategory> loadAll(Integer startPage, Integer pageSize);

  public List<ResPrintBlockCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
