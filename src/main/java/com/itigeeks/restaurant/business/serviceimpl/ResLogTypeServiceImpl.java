package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResLogTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResLogType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogTypeDAO;

/**
 * Implementation of ResLogTypeService
 */
@Service
public class ResLogTypeServiceImpl implements ResLogTypeService {


  @Autowired
  private ResLogTypeDAO resLogTypeDAO;

  @Override
  public void delete(ResLogType resLogType) {
    resLogTypeDAO.delete(resLogType);
  }



  @Override
  public ResLogType saveOrUpdate(ResLogType resLogType) {
    return resLogTypeDAO.saveOrUpdate(resLogType);
  }

  @Override
  public ResLogType load(Long id) {
    return resLogTypeDAO.load(id);

  }


  @Override
  public List<ResLogType> loadAll() {
    return resLogTypeDAO.loadAll();
  }

  @Override
  public List<ResLogType> loadByNamedQuery(String queryName) {
    return resLogTypeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resLogTypeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResLogType> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resLogTypeDAO.countAll();

  }

  @Override
  public List<ResLogType> loadWithAllCriteria(Map<String, Object> criteria) {
    return resLogTypeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResLogType> loadAll(Integer startPage, Integer pageSize) {
    return resLogTypeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResLogType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResLogType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResLogType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResLogType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resLogTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResLogType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resLogTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResLogType> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resLogTypeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resLogTypeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resLogTypeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
