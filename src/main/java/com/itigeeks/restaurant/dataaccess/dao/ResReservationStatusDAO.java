package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResReservationStatusDAO {


  public void delete(ResReservationStatus resReservationStatus);

  public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus);

  public ResReservationStatus load(Long id);

  public List<ResReservationStatus> loadAll();

  public List<ResReservationStatus> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationStatus> loadByNamedQuery(String queryName);

  public List<ResReservationStatus> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResReservationStatus> load(Map<String, Object> criteria);

  public List<ResReservationStatus> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
