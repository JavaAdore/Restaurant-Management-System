package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductService;
import com.itigeeks.restaurant.common.entity.schema.ResProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductDAO;

/**
 * Implementation of ResProductService
 */
@Service
public class ResProductServiceImpl implements ResProductService {


  @Autowired
  private ResProductDAO resProductDAO;

  @Override
  public void delete(ResProduct resProduct) {
    resProductDAO.delete(resProduct);
  }



  @Override
  public ResProduct saveOrUpdate(ResProduct resProduct) {
    return resProductDAO.saveOrUpdate(resProduct);
  }

  @Override
  public ResProduct load(Long id) {
    return resProductDAO.load(id);

  }


  @Override
  public List<ResProduct> loadAll() {
    return resProductDAO.loadAll();
  }

  @Override
  public List<ResProduct> loadByNamedQuery(String queryName) {
    return resProductDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resProductDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProduct> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductDAO.countAll();

  }

  @Override
  public List<ResProduct> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProduct> loadAll(Integer startPage, Integer pageSize) {
    return resProductDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProduct> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProduct> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProduct> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resProductDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProduct> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resProductDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProduct> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
