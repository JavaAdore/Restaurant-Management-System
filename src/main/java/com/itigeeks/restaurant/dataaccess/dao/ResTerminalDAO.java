package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTerminal;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResTerminalDAO {


  public void delete(ResTerminal resTerminal);

  public ResTerminal saveOrUpdate(ResTerminal resTerminal);

  public ResTerminal load(Long id);

  public List<ResTerminal> loadAll();

  public List<ResTerminal> loadAll(Integer startPage, Integer pageSize);

  public List<ResTerminal> loadByNamedQuery(String queryName);

  public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResTerminal> load(Map<String, Object> criteria);

  public List<ResTerminal> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResTerminal> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
