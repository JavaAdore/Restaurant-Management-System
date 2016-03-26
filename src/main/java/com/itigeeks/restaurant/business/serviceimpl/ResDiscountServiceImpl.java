package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDiscountService;
import com.itigeeks.restaurant.common.entity.schema.ResDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountDAO;

/**
 * Implementation of ResDiscountService
 */
@Service
public class ResDiscountServiceImpl implements ResDiscountService {


  @Autowired
  private ResDiscountDAO resDiscountDAO;

  @Override
  public void delete(ResDiscount resDiscount) {
    resDiscountDAO.delete(resDiscount);
  }



  @Override
  public ResDiscount saveOrUpdate(ResDiscount resDiscount) {
    return resDiscountDAO.saveOrUpdate(resDiscount);
  }

  @Override
  public ResDiscount load(Long id) {
    return resDiscountDAO.load(id);

  }


  @Override
  public List<ResDiscount> loadAll() {
    return resDiscountDAO.loadAll();
  }

  @Override
  public List<ResDiscount> loadByNamedQuery(String queryName) {
    return resDiscountDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resDiscountDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDiscount> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDiscountDAO.countAll();

  }

  @Override
  public List<ResDiscount> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDiscountDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDiscount> loadAll(Integer startPage, Integer pageSize) {
    return resDiscountDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscount> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscount> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDiscount> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resDiscountDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDiscount> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resDiscountDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDiscount> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDiscountDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDiscountDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDiscountDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
