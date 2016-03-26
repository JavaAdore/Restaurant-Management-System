package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrinter;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResPrinterService {


  public void delete(ResPrinter resPrinter);

  public ResPrinter saveOrUpdate(ResPrinter resPrinter);

  public ResPrinter load(Long id);


  public List<ResPrinter> loadAll();


  public List<ResPrinter> loadByNamedQuery(String queryName);


  public List<ResPrinter> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResPrinter> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResPrinter> loadAll(Integer startPage, Integer pageSize);

  public List<ResPrinter> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResPrinter> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResPrinter> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPrinter> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResPrinter> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResPrinter> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPrinter> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
