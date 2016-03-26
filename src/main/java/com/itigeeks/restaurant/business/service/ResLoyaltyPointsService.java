package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResLoyaltyPointsService {


  public void delete(ResLoyaltyPoints resLoyaltyPoints);

  public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints);

  public ResLoyaltyPoints load(Long id);


  public List<ResLoyaltyPoints> loadAll();


  public List<ResLoyaltyPoints> loadByNamedQuery(String queryName);


  public List<ResLoyaltyPoints> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResLoyaltyPoints> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResLoyaltyPoints> loadAll(Integer startPage, Integer pageSize);

  public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResLoyaltyPoints> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResLoyaltyPoints> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResLoyaltyPoints> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResLoyaltyPoints> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResLoyaltyPoints> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResLoyaltyPoints> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
