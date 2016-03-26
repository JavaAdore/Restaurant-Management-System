package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResOrderProductAddonDAO {


  public void delete(ResOrderProductAddon resOrderProductAddon);

  public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon);

  public ResOrderProductAddon load(Long id);

  public List<ResOrderProductAddon> loadAll();

  public List<ResOrderProductAddon> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderProductAddon> loadByNamedQuery(String queryName);

  public List<ResOrderProductAddon> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResOrderProductAddon> load(Map<String, Object> criteria);

  public List<ResOrderProductAddon> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
