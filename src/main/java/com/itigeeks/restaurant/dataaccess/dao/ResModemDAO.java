package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResModem;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResModemDAO {


  public void delete(ResModem resModem);

  public ResModem saveOrUpdate(ResModem resModem);

  public ResModem load(Long id);

  public List<ResModem> loadAll();

  public List<ResModem> loadAll(Integer startPage, Integer pageSize);

  public List<ResModem> loadByNamedQuery(String queryName);

  public List<ResModem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResModem> load(Map<String, Object> criteria);

  public List<ResModem> load(Map<String, Object> criteria, QueryConjunctionType queryConjunctionType);

  public List<ResModem> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResModem> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResModem> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
