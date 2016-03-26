package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResPrinterModelDAO {


  public void delete(ResPrinterModel resPrinterModel);

  public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel);

  public ResPrinterModel load(Long id);

  public List<ResPrinterModel> loadAll();

  public List<ResPrinterModel> loadAll(Integer startPage, Integer pageSize);

  public List<ResPrinterModel> loadByNamedQuery(String queryName);

  public List<ResPrinterModel> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResPrinterModel> load(Map<String, Object> criteria);

  public List<ResPrinterModel> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
