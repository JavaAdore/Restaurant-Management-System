package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResSpecialInstructionsService {


  public void delete(ResSpecialInstructions resSpecialInstructions);

  public ResSpecialInstructions saveOrUpdate(ResSpecialInstructions resSpecialInstructions);

  public ResSpecialInstructions load(Long id);


  public List<ResSpecialInstructions> loadAll();


  public List<ResSpecialInstructions> loadByNamedQuery(String queryName);


  public List<ResSpecialInstructions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResSpecialInstructions> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResSpecialInstructions> loadAll(Integer startPage, Integer pageSize);

  public List<ResSpecialInstructions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
