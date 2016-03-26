package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliveryCharges;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDeliveryChargesDAO {


  public void delete(ResDeliveryCharges resDeliveryCharges);

  public ResDeliveryCharges saveOrUpdate(ResDeliveryCharges resDeliveryCharges);

  public ResDeliveryCharges load(Long id);

  public List<ResDeliveryCharges> loadAll();

  public List<ResDeliveryCharges> loadAll(Integer startPage, Integer pageSize);

  public List<ResDeliveryCharges> loadByNamedQuery(String queryName);

  public List<ResDeliveryCharges> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResDeliveryCharges> load(Map<String, Object> criteria);

  public List<ResDeliveryCharges> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDeliveryCharges> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResDeliveryCharges> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResDeliveryCharges> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
