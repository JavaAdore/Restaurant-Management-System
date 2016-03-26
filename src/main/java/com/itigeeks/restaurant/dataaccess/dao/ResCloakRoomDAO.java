package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResCloakRoomDAO {


  public void delete(ResCloakRoom resCloakRoom);

  public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom);

  public ResCloakRoom load(Long id);

  public List<ResCloakRoom> loadAll();

  public List<ResCloakRoom> loadAll(Integer startPage, Integer pageSize);

  public List<ResCloakRoom> loadByNamedQuery(String queryName);

  public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters);

  public List<ResCloakRoom> load(Map<String, Object> criteria);

  public List<ResCloakRoom> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer firstPage, Integer pageSize);

  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType);

  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
