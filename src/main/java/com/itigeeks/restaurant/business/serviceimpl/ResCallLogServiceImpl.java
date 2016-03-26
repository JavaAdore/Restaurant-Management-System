package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCallLogService;
import com.itigeeks.restaurant.common.entity.schema.ResCallLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCallLogDAO;

/**
 * Implementation of ResCallLogService
 */
@Service
public class ResCallLogServiceImpl implements ResCallLogService {


  @Autowired
  private ResCallLogDAO resCallLogDAO;

  @Override
  public void delete(ResCallLog resCallLog) {
    resCallLogDAO.delete(resCallLog);
  }



  @Override
  public ResCallLog saveOrUpdate(ResCallLog resCallLog) {
    return resCallLogDAO.saveOrUpdate(resCallLog);
  }

  @Override
  public ResCallLog load(Long id) {
    return resCallLogDAO.load(id);

  }


  @Override
  public List<ResCallLog> loadAll() {
    return resCallLogDAO.loadAll();
  }

  @Override
  public List<ResCallLog> loadByNamedQuery(String queryName) {
    return resCallLogDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCallLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resCallLogDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCallLog> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCallLogDAO.countAll();

  }

  @Override
  public List<ResCallLog> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCallLogDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCallLog> loadAll(Integer startPage, Integer pageSize) {
    return resCallLogDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCallLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCallLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCallLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCallLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCallLogDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCallLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCallLogDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCallLog> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCallLogDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCallLogDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCallLogDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
