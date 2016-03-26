package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResNumberIdentifierService;
import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResNumberIdentifierDAO;

/**
 * Implementation of ResNumberIdentifierService
 */
@Service
public class ResNumberIdentifierServiceImpl implements ResNumberIdentifierService {


  @Autowired
  private ResNumberIdentifierDAO resNumberIdentifierDAO;

  @Override
  public void delete(ResNumberIdentifier resNumberIdentifier) {
    resNumberIdentifierDAO.delete(resNumberIdentifier);
  }



  @Override
  public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) {
    return resNumberIdentifierDAO.saveOrUpdate(resNumberIdentifier);
  }

  @Override
  public ResNumberIdentifier load(Long id) {
    return resNumberIdentifierDAO.load(id);

  }


  @Override
  public List<ResNumberIdentifier> loadAll() {
    return resNumberIdentifierDAO.loadAll();
  }

  @Override
  public List<ResNumberIdentifier> loadByNamedQuery(String queryName) {
    return resNumberIdentifierDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResNumberIdentifier> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resNumberIdentifierDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resNumberIdentifierDAO.countAll();

  }

  @Override
  public List<ResNumberIdentifier> loadWithAllCriteria(Map<String, Object> criteria) {
    return resNumberIdentifierDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResNumberIdentifier> loadAll(Integer startPage, Integer pageSize) {
    return resNumberIdentifierDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResNumberIdentifier> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResNumberIdentifier> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResNumberIdentifier> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resNumberIdentifierDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResNumberIdentifier> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resNumberIdentifierDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResNumberIdentifier> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resNumberIdentifierDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resNumberIdentifierDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resNumberIdentifierDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
