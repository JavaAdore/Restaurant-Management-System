package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDocContent;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResDocContentService {


  public void delete(ResDocContent resDocContent);

  public ResDocContent saveOrUpdate(ResDocContent resDocContent);

  public ResDocContent load(Long id);


  public List<ResDocContent> loadAll();


  public List<ResDocContent> loadByNamedQuery(String queryName);


  public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResDocContent> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResDocContent> loadAll(Integer startPage, Integer pageSize);

  public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResDocContent> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResDocContent> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDocContent> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResDocContent> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResDocContent> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDocContent> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
