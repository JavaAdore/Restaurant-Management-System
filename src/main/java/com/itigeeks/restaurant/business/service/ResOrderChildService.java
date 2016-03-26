package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResOrderChildService {


  public void delete(ResOrderChild resOrderChild);

  public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild);

  public ResOrderChild load(Long id);


  public List<ResOrderChild> loadAll();


  public List<ResOrderChild> loadByNamedQuery(String queryName);


  public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResOrderChild> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResOrderChild> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResOrderChild> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResOrderChild> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderChild> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResOrderChild> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResOrderChild> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResOrderChild> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
