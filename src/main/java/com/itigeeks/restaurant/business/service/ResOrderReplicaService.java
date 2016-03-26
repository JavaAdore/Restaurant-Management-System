package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderReplica;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResOrderReplicaService {


  public void delete(ResOrderReplica resOrderReplica);

  public ResOrderReplica saveOrUpdate(ResOrderReplica resOrderReplica);

  public ResOrderReplica load(Long id);


  public List<ResOrderReplica> loadAll();


  public List<ResOrderReplica> loadByNamedQuery(String queryName);


  public List<ResOrderReplica> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResOrderReplica> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResOrderReplica> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderReplica> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
