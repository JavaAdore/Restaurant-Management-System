package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResAdditionalCompanyService {


  public void delete(ResAdditionalCompany resAdditionalCompany);

  public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany);

  public ResAdditionalCompany load(Long id);


  public List<ResAdditionalCompany> loadAll();


  public List<ResAdditionalCompany> loadByNamedQuery(String queryName);


  public List<ResAdditionalCompany> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResAdditionalCompany> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResAdditionalCompany> loadAll(Integer startPage, Integer pageSize);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResAdditionalCompany> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResAdditionalCompany> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResAdditionalCompany> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResAdditionalCompany> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResAdditionalCompany> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResAdditionalCompany> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
