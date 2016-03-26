package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategoryOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResCategoryOrderCategoryDAO {


  public void delete(ResCategoryOrderCategory resCategoryOrderCategory);

  public ResCategoryOrderCategory saveOrUpdate(ResCategoryOrderCategory resCategoryOrderCategory);

  public ResCategoryOrderCategory load(Long id);

  public List<ResCategoryOrderCategory> loadAll();

  public List<ResCategoryOrderCategory> loadAll(Integer startPage, Integer pageSize);

  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName);

  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria);

  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
