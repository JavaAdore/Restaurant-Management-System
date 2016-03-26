package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCloakRoomStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomStatusDAO;

/**
 * Implementation of ResCloakRoomStatusService
 */
@Service
public class ResCloakRoomStatusServiceImpl implements ResCloakRoomStatusService {


  @Autowired
  private ResCloakRoomStatusDAO resCloakRoomStatusDAO;

  @Override
  public void delete(ResCloakRoomStatus resCloakRoomStatus) {
    resCloakRoomStatusDAO.delete(resCloakRoomStatus);
  }



  @Override
  public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus) {
    return resCloakRoomStatusDAO.saveOrUpdate(resCloakRoomStatus);
  }

  @Override
  public ResCloakRoomStatus load(Long id) {
    return resCloakRoomStatusDAO.load(id);

  }


  @Override
  public List<ResCloakRoomStatus> loadAll() {
    return resCloakRoomStatusDAO.loadAll();
  }

  @Override
  public List<ResCloakRoomStatus> loadByNamedQuery(String queryName) {
    return resCloakRoomStatusDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCloakRoomStatus> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resCloakRoomStatusDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCloakRoomStatus> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCloakRoomStatusDAO.countAll();

  }

  @Override
  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCloakRoomStatusDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCloakRoomStatus> loadAll(Integer startPage, Integer pageSize) {
    return resCloakRoomStatusDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCloakRoomStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCloakRoomStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCloakRoomStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCloakRoomStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCloakRoomStatus> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCloakRoomStatusDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCloakRoomStatusDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCloakRoomStatusDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
