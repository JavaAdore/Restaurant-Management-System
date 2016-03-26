package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResReservationTypeService {


  public void delete(ResReservationType resReservationType);

  public ResReservationType saveOrUpdate(ResReservationType resReservationType);

  public ResReservationType load(Long id);


  public List<ResReservationType> loadAll();


  public List<ResReservationType> loadByNamedQuery(String queryName);


  public List<ResReservationType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResReservationType> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResReservationType> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
