package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDashboardSettingsDAO {


  public void delete(ResDashboardSettings resDashboardSettings);

  public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings);

  public ResDashboardSettings load(Long id);

  public List<ResDashboardSettings> loadAll();

  public List<ResDashboardSettings> loadAll(Integer startPage, Integer pageSize);

  public List<ResDashboardSettings> loadByNamedQuery(String queryName);

  public List<ResDashboardSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResDashboardSettings> load(Map<String, Object> criteria);

  public List<ResDashboardSettings> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
