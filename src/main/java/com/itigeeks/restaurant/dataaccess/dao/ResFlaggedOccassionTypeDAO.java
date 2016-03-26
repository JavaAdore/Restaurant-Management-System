package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResFlaggedOccassionTypeDAO {


  public void delete(ResFlaggedOccassionType resFlaggedOccassionType);

  public ResFlaggedOccassionType saveOrUpdate(ResFlaggedOccassionType resFlaggedOccassionType);

  public ResFlaggedOccassionType load(Long id);

  public List<ResFlaggedOccassionType> loadAll();

  public List<ResFlaggedOccassionType> loadAll(Integer startPage, Integer pageSize);

  public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName);

  public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
