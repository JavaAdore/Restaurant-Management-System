package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResCloakRoomStatusService {


  public void delete(ResCloakRoomStatus resCloakRoomStatus);

  public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus);

  public ResCloakRoomStatus load(Long id);


  public List<ResCloakRoomStatus> loadAll();


  public List<ResCloakRoomStatus> loadByNamedQuery(String queryName);


  public List<ResCloakRoomStatus> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResCloakRoomStatus> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResCloakRoomStatus> loadAll(Integer startPage, Integer pageSize);

  public List<ResCloakRoomStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
