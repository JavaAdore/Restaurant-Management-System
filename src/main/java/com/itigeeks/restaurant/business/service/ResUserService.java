package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResUser;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResUserService {


  public void delete(ResUser resUser);

  public ResUser saveOrUpdate(ResUser resUser);

  public ResUser load(Long id);


  public List<ResUser> loadAll();


  public List<ResUser> loadByNamedQuery(String queryName);


  public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResUser> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResUser> loadAll(Integer startPage, Integer pageSize);

  public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
