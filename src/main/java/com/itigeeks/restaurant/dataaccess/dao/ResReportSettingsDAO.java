package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReportSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResReportSettingsDAO {


  public void delete(ResReportSettings resReportSettings);

  public ResReportSettings saveOrUpdate(ResReportSettings resReportSettings);

  public ResReportSettings load(Long id);

  public List<ResReportSettings> loadAll();

  public List<ResReportSettings> loadAll(Integer startPage, Integer pageSize);

  public List<ResReportSettings> loadByNamedQuery(String queryName);

  public List<ResReportSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResReportSettings> load(Map<String, Object> criteria);

  public List<ResReportSettings> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResReportSettings> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResReportSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResReportSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
