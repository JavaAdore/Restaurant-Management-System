package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductMiscService;
import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductMiscDAO;

/**
 * Implementation of ResProductMiscService
 */
@Service
public class ResProductMiscServiceImpl implements ResProductMiscService {


  @Autowired
  private ResProductMiscDAO resProductMiscDAO;

  @Override
  public void delete(ResProductMisc resProductMisc) {
    resProductMiscDAO.delete(resProductMisc);
  }



  @Override
  public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc) {
    return resProductMiscDAO.saveOrUpdate(resProductMisc);
  }

  @Override
  public ResProductMisc load(Long id) {
    return resProductMiscDAO.load(id);

  }


  @Override
  public List<ResProductMisc> loadAll() {
    return resProductMiscDAO.loadAll();
  }

  @Override
  public List<ResProductMisc> loadByNamedQuery(String queryName) {
    return resProductMiscDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resProductMiscDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProductMisc> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductMiscDAO.countAll();

  }

  @Override
  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductMiscDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProductMisc> loadAll(Integer startPage, Integer pageSize) {
    return resProductMiscDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductMisc> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resProductMiscDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resProductMiscDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProductMisc> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductMiscDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductMiscDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductMiscDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
