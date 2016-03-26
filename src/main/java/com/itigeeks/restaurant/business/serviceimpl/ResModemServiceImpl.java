package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResModemService;
import com.itigeeks.restaurant.common.entity.schema.ResModem;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResModemDAO;

/**
 * Implementation of ResModemService
 */
@Service
public class ResModemServiceImpl implements ResModemService {


  @Autowired
  private ResModemDAO resModemDAO;

  @Override
  public void delete(ResModem resModem) {
    resModemDAO.delete(resModem);
  }



  @Override
  public ResModem saveOrUpdate(ResModem resModem) {
    return resModemDAO.saveOrUpdate(resModem);
  }

  @Override
  public ResModem load(Long id) {
    return resModemDAO.load(id);

  }


  @Override
  public List<ResModem> loadAll() {
    return resModemDAO.loadAll();
  }

  @Override
  public List<ResModem> loadByNamedQuery(String queryName) {
    return resModemDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResModem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resModemDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResModem> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resModemDAO.countAll();

  }

  @Override
  public List<ResModem> loadWithAllCriteria(Map<String, Object> criteria) {
    return resModemDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResModem> loadAll(Integer startPage, Integer pageSize) {
    return resModemDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResModem> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResModem> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResModem> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResModem> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resModemDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResModem> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resModemDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResModem> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resModemDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resModemDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resModemDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
