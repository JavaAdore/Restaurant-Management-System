package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCloakRoomService;
import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomDAO;

/**
 * Implementation of ResCloakRoomService
 */
@Service
public class ResCloakRoomServiceImpl implements ResCloakRoomService {


  @Autowired
  private ResCloakRoomDAO resCloakRoomDAO;

  @Override
  public void delete(ResCloakRoom resCloakRoom) {
    resCloakRoomDAO.delete(resCloakRoom);
  }



  @Override
  public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom) {
    return resCloakRoomDAO.saveOrUpdate(resCloakRoom);
  }

  @Override
  public ResCloakRoom load(Long id) {
    return resCloakRoomDAO.load(id);

  }


  @Override
  public List<ResCloakRoom> loadAll() {
    return resCloakRoomDAO.loadAll();
  }

  @Override
  public List<ResCloakRoom> loadByNamedQuery(String queryName) {
    return resCloakRoomDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resCloakRoomDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCloakRoomDAO.countAll();

  }

  @Override
  public List<ResCloakRoom> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCloakRoomDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCloakRoom> loadAll(Integer startPage, Integer pageSize) {
    return resCloakRoomDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoom> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoom> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoom> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCloakRoomDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCloakRoom> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCloakRoomDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCloakRoom> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCloakRoomDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCloakRoomDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCloakRoomDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
