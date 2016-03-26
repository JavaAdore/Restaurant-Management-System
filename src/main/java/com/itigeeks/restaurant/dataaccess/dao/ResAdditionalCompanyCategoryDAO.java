package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResAdditionalCompanyCategoryDAO {


  public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory);

  public ResAdditionalCompanyCategory saveOrUpdate(
      ResAdditionalCompanyCategory resAdditionalCompanyCategory);

  public ResAdditionalCompanyCategory load(Long id);

  public List<ResAdditionalCompanyCategory> loadAll();

  public List<ResAdditionalCompanyCategory> loadAll(Integer startPage, Integer pageSize);

  public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName);

  public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria);

  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
