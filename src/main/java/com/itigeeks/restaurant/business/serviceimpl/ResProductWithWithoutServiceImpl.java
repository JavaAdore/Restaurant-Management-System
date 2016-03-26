package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductWithWithoutService;
import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWithWithoutDAO;

/**
 * Implementation of ResProductWithWithoutService
 */
@Service
public class ResProductWithWithoutServiceImpl implements ResProductWithWithoutService {


  @Autowired
  private ResProductWithWithoutDAO resProductWithWithoutDAO;

  @Override
  public void delete(ResProductWithWithout resProductWithWithout) {
    resProductWithWithoutDAO.delete(resProductWithWithout);
  }



  @Override
  public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) {
    return resProductWithWithoutDAO.saveOrUpdate(resProductWithWithout);
  }

  @Override
  public ResProductWithWithout load(Long id) {
    return resProductWithWithoutDAO.load(id);

  }


  @Override
  public List<ResProductWithWithout> loadAll() {
    return resProductWithWithoutDAO.loadAll();
  }

  @Override
  public List<ResProductWithWithout> loadByNamedQuery(String queryName) {
    return resProductWithWithoutDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProductWithWithout> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resProductWithWithoutDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductWithWithoutDAO.countAll();

  }

  @Override
  public List<ResProductWithWithout> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductWithWithoutDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProductWithWithout> loadAll(Integer startPage, Integer pageSize) {
    return resProductWithWithoutDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWithWithout> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWithWithout> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWithWithout> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductWithWithoutDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductWithWithout> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductWithWithoutDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProductWithWithout> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductWithWithoutDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductWithWithoutDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductWithWithoutDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
