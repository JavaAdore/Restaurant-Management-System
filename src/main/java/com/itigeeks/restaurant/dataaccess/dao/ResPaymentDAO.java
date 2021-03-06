package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPayment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResPaymentDAO {


  public void delete(ResPayment resPayment);

  public ResPayment saveOrUpdate(ResPayment resPayment);

  public ResPayment load(Long id);

  public List<ResPayment> loadAll();

  public List<ResPayment> loadAll(Integer startPage, Integer pageSize);

  public List<ResPayment> loadByNamedQuery(String queryName);

  public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResPayment> load(Map<String, Object> criteria);

  public List<ResPayment> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResPayment> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
