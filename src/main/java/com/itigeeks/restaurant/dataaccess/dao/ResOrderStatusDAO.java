package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResOrderStatusDAO {


  public void delete(ResOrderStatus resOrderStatus);

  public ResOrderStatus saveOrUpdate(ResOrderStatus resOrderStatus);

  public ResOrderStatus load(Long id);

  public List<ResOrderStatus> loadAll();

  public List<ResOrderStatus> loadAll(Integer startPage, Integer pageSize);

  public List<ResOrderStatus> loadByNamedQuery(String queryName);

  public List<ResOrderStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResOrderStatus> load(Map<String, Object> criteria);

  public List<ResOrderStatus> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResOrderStatus> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResOrderStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResOrderStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
