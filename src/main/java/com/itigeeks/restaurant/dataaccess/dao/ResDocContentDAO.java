package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDocContent;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDocContentDAO {


  public void delete(ResDocContent resDocContent);

  public ResDocContent saveOrUpdate(ResDocContent resDocContent);

  public ResDocContent load(Long id);

  public List<ResDocContent> loadAll();

  public List<ResDocContent> loadAll(Integer startPage, Integer pageSize);

  public List<ResDocContent> loadByNamedQuery(String queryName);

  public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResDocContent> load(Map<String, Object> criteria);

  public List<ResDocContent> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDocContent> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
