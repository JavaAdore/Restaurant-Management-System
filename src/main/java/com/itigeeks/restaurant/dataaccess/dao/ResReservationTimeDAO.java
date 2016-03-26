package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResReservationTimeDAO {


  public void delete(ResReservationTime resReservationTime);

  public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime);

  public ResReservationTime load(Long id);

  public List<ResReservationTime> loadAll();

  public List<ResReservationTime> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationTime> loadByNamedQuery(String queryName);

  public List<ResReservationTime> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResReservationTime> load(Map<String, Object> criteria);

  public List<ResReservationTime> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResReservationTime> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
