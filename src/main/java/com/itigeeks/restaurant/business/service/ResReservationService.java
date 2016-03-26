package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservation;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResReservationService {


  public void delete(ResReservation resReservation);

  public ResReservation saveOrUpdate(ResReservation resReservation);

  public ResReservation load(Long id);


  public List<ResReservation> loadAll();


  public List<ResReservation> loadByNamedQuery(String queryName);


  public List<ResReservation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);


  public List<ResReservation> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResReservation> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize);

  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);

  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
