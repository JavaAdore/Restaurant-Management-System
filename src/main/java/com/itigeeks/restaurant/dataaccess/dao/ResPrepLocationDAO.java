package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResPrepLocationDAO {


  public void delete(ResPrepLocation resPrepLocation);

  public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation);

  public ResPrepLocation load(Long id);

  public List<ResPrepLocation> loadAll();

  public List<ResPrepLocation> loadAll(Integer startPage, Integer pageSize);

  public List<ResPrepLocation> loadByNamedQuery(String queryName);

  public List<ResPrepLocation> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResPrepLocation> load(Map<String, Object> criteria);

  public List<ResPrepLocation> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResPrepLocation> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResPrepLocation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResPrepLocation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
