package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResReservationDAO {


  public void delete(ResReservation resReservation);

  public ResReservation saveOrUpdate(ResReservation resReservation);

  public ResReservation load(Long id);

  public List<ResReservation> loadAll();

  public List<ResReservation> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservation> loadByNamedQuery(String queryName);

  public List<ResReservation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResReservation> load(Map<String, Object> criteria);

  public List<ResReservation> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResReservation> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResReservation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResReservation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
