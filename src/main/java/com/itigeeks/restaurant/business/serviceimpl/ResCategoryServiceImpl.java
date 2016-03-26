package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryDAO;

/**
 * Implementation of ResCategoryService
 */
@Service
public class ResCategoryServiceImpl implements ResCategoryService {


  @Autowired
  private ResCategoryDAO resCategoryDAO;

  @Override
  public void delete(ResCategory resCategory) {
    resCategoryDAO.delete(resCategory);
  }



  @Override
  public ResCategory saveOrUpdate(ResCategory resCategory) {
    return resCategoryDAO.saveOrUpdate(resCategory);
  }

  @Override
  public ResCategory load(Long id) {
    return resCategoryDAO.load(id);

  }


  @Override
  public List<ResCategory> loadAll() {
    return resCategoryDAO.loadAll();
  }

  @Override
  public List<ResCategory> loadByNamedQuery(String queryName) {
    return resCategoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resCategoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCategory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCategoryDAO.countAll();

  }

  @Override
  public List<ResCategory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCategoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCategory> loadAll(Integer startPage, Integer pageSize) {
    return resCategoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategory> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategory> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategory> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCategory> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCategory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCategoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCategoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCategoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
