package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderReplicaService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderReplica;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderReplicaDAO;

/**
 * Implementation of ResOrderReplicaService
 */
@Service
public class ResOrderReplicaServiceImpl implements ResOrderReplicaService {


  @Autowired
  private ResOrderReplicaDAO resOrderReplicaDAO;

  @Override
  public void delete(ResOrderReplica resOrderReplica) {
    resOrderReplicaDAO.delete(resOrderReplica);
  }



  @Override
  public ResOrderReplica saveOrUpdate(ResOrderReplica resOrderReplica) {
    return resOrderReplicaDAO.saveOrUpdate(resOrderReplica);
  }

  @Override
  public ResOrderReplica load(Long id) {
    return resOrderReplicaDAO.load(id);

  }


  @Override
  public List<ResOrderReplica> loadAll() {
    return resOrderReplicaDAO.loadAll();
  }

  @Override
  public List<ResOrderReplica> loadByNamedQuery(String queryName) {
    return resOrderReplicaDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResOrderReplica> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resOrderReplicaDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resOrderReplicaDAO.countAll();

  }

  @Override
  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria) {
    return resOrderReplicaDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResOrderReplica> loadAll(Integer startPage, Integer pageSize) {
    return resOrderReplicaDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderReplica> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resOrderReplicaDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resOrderReplicaDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResOrderReplica> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderReplicaDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resOrderReplicaDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderReplicaDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
