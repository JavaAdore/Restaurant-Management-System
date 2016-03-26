package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResPaymentMethodDAO {


  public void delete(ResPaymentMethod resPaymentMethod);

  public ResPaymentMethod saveOrUpdate(ResPaymentMethod resPaymentMethod);

  public ResPaymentMethod load(Long id);

  public List<ResPaymentMethod> loadAll();

  public List<ResPaymentMethod> loadAll(Integer startPage, Integer pageSize);

  public List<ResPaymentMethod> loadByNamedQuery(String queryName);

  public List<ResPaymentMethod> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResPaymentMethod> load(Map<String, Object> criteria);

  public List<ResPaymentMethod> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
