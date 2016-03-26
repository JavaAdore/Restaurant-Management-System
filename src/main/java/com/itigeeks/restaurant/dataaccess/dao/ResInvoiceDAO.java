package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResInvoice;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResInvoiceDAO {


  public void delete(ResInvoice resInvoice);

  public ResInvoice saveOrUpdate(ResInvoice resInvoice);

  public ResInvoice load(Long id);

  public List<ResInvoice> loadAll();

  public List<ResInvoice> loadAll(Integer startPage, Integer pageSize);

  public List<ResInvoice> loadByNamedQuery(String queryName);

  public List<ResInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResInvoice> load(Map<String, Object> criteria);

  public List<ResInvoice> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResInvoice> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResInvoice> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResInvoice> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
