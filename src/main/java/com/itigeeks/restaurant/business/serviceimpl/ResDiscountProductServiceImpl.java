package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDiscountProductService;
import com.itigeeks.restaurant.common.entity.schema.ResDiscountProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountProductDAO;

/**
 * Implementation of ResDiscountProductService
 */
@Service
public class ResDiscountProductServiceImpl implements ResDiscountProductService {


  @Autowired
  private ResDiscountProductDAO resDiscountProductDAO;

  @Override
  public void delete(ResDiscountProduct resDiscountProduct) {
    resDiscountProductDAO.delete(resDiscountProduct);
  }



  @Override
  public ResDiscountProduct saveOrUpdate(ResDiscountProduct resDiscountProduct) {
    return resDiscountProductDAO.saveOrUpdate(resDiscountProduct);
  }

  @Override
  public ResDiscountProduct load(Long id) {
    return resDiscountProductDAO.load(id);

  }


  @Override
  public List<ResDiscountProduct> loadAll() {
    return resDiscountProductDAO.loadAll();
  }

  @Override
  public List<ResDiscountProduct> loadByNamedQuery(String queryName) {
    return resDiscountProductDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDiscountProduct> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resDiscountProductDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDiscountProduct> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDiscountProductDAO.countAll();

  }

  @Override
  public List<ResDiscountProduct> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDiscountProductDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDiscountProduct> loadAll(Integer startPage, Integer pageSize) {
    return resDiscountProductDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDiscountProduct> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscountProduct> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscountProduct> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscountProduct> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDiscountProductDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDiscountProduct> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDiscountProductDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDiscountProduct> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDiscountProductDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDiscountProductDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDiscountProductDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
