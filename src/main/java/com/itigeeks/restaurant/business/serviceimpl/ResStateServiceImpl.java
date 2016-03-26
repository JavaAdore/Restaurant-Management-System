package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResStateService;
import com.itigeeks.restaurant.common.entity.schema.ResState;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResStateDAO;

/**
 * Implementation of ResStateService
 */
@Service
public class ResStateServiceImpl implements ResStateService {


  @Autowired
  private ResStateDAO resStateDAO;

  @Override
  public void delete(ResState resState) {
    resStateDAO.delete(resState);
  }



  @Override
  public ResState saveOrUpdate(ResState resState) {
    return resStateDAO.saveOrUpdate(resState);
  }

  @Override
  public ResState load(Long id) {
    return resStateDAO.load(id);

  }


  @Override
  public List<ResState> loadAll() {
    return resStateDAO.loadAll();
  }

  @Override
  public List<ResState> loadByNamedQuery(String queryName) {
    return resStateDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resStateDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResState> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resStateDAO.countAll();

  }

  @Override
  public List<ResState> loadWithAllCriteria(Map<String, Object> criteria) {
    return resStateDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResState> loadAll(Integer startPage, Integer pageSize) {
    return resStateDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResState> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResState> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResState> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resStateDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResState> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resStateDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResState> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resStateDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resStateDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resStateDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
