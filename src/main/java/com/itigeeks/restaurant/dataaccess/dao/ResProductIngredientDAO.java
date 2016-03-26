package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductIngredient;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResProductIngredientDAO {


  public void delete(ResProductIngredient resProductIngredient);

  public ResProductIngredient saveOrUpdate(ResProductIngredient resProductIngredient);

  public ResProductIngredient load(Long id);

  public List<ResProductIngredient> loadAll();

  public List<ResProductIngredient> loadAll(Integer startPage, Integer pageSize);

  public List<ResProductIngredient> loadByNamedQuery(String queryName);

  public List<ResProductIngredient> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResProductIngredient> load(Map<String, Object> criteria);

  public List<ResProductIngredient> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
