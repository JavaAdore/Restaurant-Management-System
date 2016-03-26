package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResAdditionalCompanyDAO {


  public void delete(ResAdditionalCompany resAdditionalCompany);

  public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany);

  public ResAdditionalCompany load(Long id);

  public List<ResAdditionalCompany> loadAll();

  public List<ResAdditionalCompany> loadAll(Integer startPage, Integer pageSize);

  public List<ResAdditionalCompany> loadByNamedQuery(String queryName);

  public List<ResAdditionalCompany> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
