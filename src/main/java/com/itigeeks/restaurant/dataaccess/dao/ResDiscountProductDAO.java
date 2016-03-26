package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscountProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDiscountProductDAO {


  public void delete(ResDiscountProduct resDiscountProduct);

  public ResDiscountProduct saveOrUpdate(ResDiscountProduct resDiscountProduct);

  public ResDiscountProduct load(Long id);

  public List<ResDiscountProduct> loadAll();

  public List<ResDiscountProduct> loadAll(Integer startPage, Integer pageSize);

  public List<ResDiscountProduct> loadByNamedQuery(String queryName);

  public List<ResDiscountProduct> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResDiscountProduct> load(Map<String, Object> criteria);

  public List<ResDiscountProduct> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
