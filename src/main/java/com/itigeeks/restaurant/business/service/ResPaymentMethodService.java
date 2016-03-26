package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResPaymentMethodService {


  public void delete(ResPaymentMethod resPaymentMethod);

  public ResPaymentMethod saveOrUpdate(ResPaymentMethod resPaymentMethod);

  public ResPaymentMethod load(Long id);


  public List<ResPaymentMethod> loadAll();


  public List<ResPaymentMethod> loadByNamedQuery(String queryName);


  public List<ResPaymentMethod> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResPaymentMethod> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResPaymentMethod> loadAll(Integer startPage, Integer pageSize);

  public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
