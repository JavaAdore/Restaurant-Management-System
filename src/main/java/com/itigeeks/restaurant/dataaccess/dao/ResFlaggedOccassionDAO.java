package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResFlaggedOccassionDAO {


  public void delete(ResFlaggedOccassion resFlaggedOccassion);

  public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion);

  public ResFlaggedOccassion load(Long id);

  public List<ResFlaggedOccassion> loadAll();

  public List<ResFlaggedOccassion> loadAll(Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName);

  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
