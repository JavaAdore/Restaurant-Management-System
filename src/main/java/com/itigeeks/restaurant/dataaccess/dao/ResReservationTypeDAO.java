package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResReservationTypeDAO {


  public void delete(ResReservationType resReservationType);

  public ResReservationType saveOrUpdate(ResReservationType resReservationType);

  public ResReservationType load(Long id);

  public List<ResReservationType> loadAll();

  public List<ResReservationType> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationType> loadByNamedQuery(String queryName);

  public List<ResReservationType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResReservationType> load(Map<String, Object> criteria);

  public List<ResReservationType> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResReservationType> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
