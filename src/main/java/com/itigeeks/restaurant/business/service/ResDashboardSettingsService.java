package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResDashboardSettingsService {


  public void delete(ResDashboardSettings resDashboardSettings);

  public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings);

  public ResDashboardSettings load(Long id);


  public List<ResDashboardSettings> loadAll();


  public List<ResDashboardSettings> loadByNamedQuery(String queryName);


  public List<ResDashboardSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResDashboardSettings> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResDashboardSettings> loadAll(Integer startPage, Integer pageSize);

  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
