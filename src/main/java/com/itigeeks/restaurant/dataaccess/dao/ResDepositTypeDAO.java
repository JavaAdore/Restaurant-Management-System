package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDepositType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResDepositTypeDAO {


  public void delete(ResDepositType resDepositType);

  public ResDepositType saveOrUpdate(ResDepositType resDepositType);

  public ResDepositType load(Long id);

  public List<ResDepositType> loadAll();

  public List<ResDepositType> loadAll(Integer startPage, Integer pageSize);

  public List<ResDepositType> loadByNamedQuery(String queryName);

  public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResDepositType> load(Map<String, Object> criteria);

  public List<ResDepositType> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResDepositType> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
