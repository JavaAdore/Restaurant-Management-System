package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDeliverCharges;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResDeliverChargesService {


  public void delete(ResDeliverCharges resDeliverCharges);

  public ResDeliverCharges saveOrUpdate(ResDeliverCharges resDeliverCharges);

  public ResDeliverCharges load(Long id);


  public List<ResDeliverCharges> loadAll();


  public List<ResDeliverCharges> loadByNamedQuery(String queryName);


  public List<ResDeliverCharges> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResDeliverCharges> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResDeliverCharges> loadAll(Integer startPage, Integer pageSize);

  public List<ResDeliverCharges> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
