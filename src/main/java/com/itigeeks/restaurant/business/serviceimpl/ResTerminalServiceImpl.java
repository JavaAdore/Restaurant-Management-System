package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResTerminalService;
import com.itigeeks.restaurant.common.entity.schema.ResTerminal;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTerminalDAO;

/**
 * Implementation of ResTerminalService
 */
@Service
public class ResTerminalServiceImpl implements ResTerminalService {


  @Autowired
  private ResTerminalDAO resTerminalDAO;

  @Override
  public void delete(ResTerminal resTerminal) {
    resTerminalDAO.delete(resTerminal);
  }



  @Override
  public ResTerminal saveOrUpdate(ResTerminal resTerminal) {
    return resTerminalDAO.saveOrUpdate(resTerminal);
  }

  @Override
  public ResTerminal load(Long id) {
    return resTerminalDAO.load(id);

  }


  @Override
  public List<ResTerminal> loadAll() {
    return resTerminalDAO.loadAll();
  }

  @Override
  public List<ResTerminal> loadByNamedQuery(String queryName) {
    return resTerminalDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resTerminalDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResTerminal> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resTerminalDAO.countAll();

  }

  @Override
  public List<ResTerminal> loadWithAllCriteria(Map<String, Object> criteria) {
    return resTerminalDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResTerminal> loadAll(Integer startPage, Integer pageSize) {
    return resTerminalDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTerminal> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTerminal> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTerminal> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resTerminalDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResTerminal> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resTerminalDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResTerminal> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resTerminalDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resTerminalDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resTerminalDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
