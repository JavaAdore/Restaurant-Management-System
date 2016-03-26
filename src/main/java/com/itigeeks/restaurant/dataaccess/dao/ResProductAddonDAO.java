package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResProductAddonDAO {


  public void delete(ResProductAddon resProductAddon);

  public ResProductAddon saveOrUpdate(ResProductAddon resProductAddon);

  public ResProductAddon load(Long id);

  public List<ResProductAddon> loadAll();

  public List<ResProductAddon> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductAddon> loadByNamedQuery(String queryName);

  public List<ResProductAddon> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResProductAddon> load(Map<String, Object> criteria);

  public List<ResProductAddon> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResProductAddon> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
