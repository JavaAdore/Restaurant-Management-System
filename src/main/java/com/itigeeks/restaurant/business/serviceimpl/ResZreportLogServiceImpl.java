package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResZreportLogService;
import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportLogDAO;

/**
 * Implementation of ResZreportLogService
 */
@Service
public class ResZreportLogServiceImpl implements ResZreportLogService {


  @Autowired
  private ResZreportLogDAO resZreportLogDAO;

  @Override
  public void delete(ResZreportLog resZreportLog) {
    resZreportLogDAO.delete(resZreportLog);
  }



  @Override
  public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog) {
    return resZreportLogDAO.saveOrUpdate(resZreportLog);
  }

  @Override
  public ResZreportLog load(Long id) {
    return resZreportLogDAO.load(id);

  }


  @Override
  public List<ResZreportLog> loadAll() {
    return resZreportLogDAO.loadAll();
  }

  @Override
  public List<ResZreportLog> loadByNamedQuery(String queryName) {
    return resZreportLogDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resZreportLogDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resZreportLogDAO.countAll();

  }

  @Override
  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria) {
    return resZreportLogDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResZreportLog> loadAll(Integer startPage, Integer pageSize) {
    return resZreportLogDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResZreportLog> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resZreportLogDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resZreportLogDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResZreportLog> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resZreportLogDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resZreportLogDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resZreportLogDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
