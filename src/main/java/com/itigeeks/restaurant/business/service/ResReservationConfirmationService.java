package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResReservationConfirmationService {


  public void delete(ResReservationConfirmation resReservationConfirmation);

  public ResReservationConfirmation saveOrUpdate(
      ResReservationConfirmation resReservationConfirmation);

  public ResReservationConfirmation load(Long id);


  public List<ResReservationConfirmation> loadAll();


  public List<ResReservationConfirmation> loadByNamedQuery(String queryName);


  public List<ResReservationConfirmation> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResReservationConfirmation> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResReservationConfirmation> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationConfirmation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
