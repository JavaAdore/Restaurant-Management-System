package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResDepositType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResDepositTypeService {


  public void delete(ResDepositType resDepositType);

  public ResDepositType saveOrUpdate(ResDepositType resDepositType);

  public ResDepositType load(Long id);


  public List<ResDepositType> loadAll();


  public List<ResDepositType> loadByNamedQuery(String queryName);


  public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResDepositType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResDepositType> loadAll(Integer startPage, Integer pageSize);

  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResDepositType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResDepositType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDepositType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResDepositType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResDepositType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResDepositType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
