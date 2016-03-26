package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPaymentMethodService;
import com.itigeeks.restaurant.common.entity.schema.ResPaymentMethod;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPaymentMethodDAO;

/**
 * Implementation of ResPaymentMethodService
 */
@Service
public class ResPaymentMethodServiceImpl implements ResPaymentMethodService {


  @Autowired
  private ResPaymentMethodDAO resPaymentMethodDAO;

  @Override
  public void delete(ResPaymentMethod resPaymentMethod) {
    resPaymentMethodDAO.delete(resPaymentMethod);
  }



  @Override
  public ResPaymentMethod saveOrUpdate(ResPaymentMethod resPaymentMethod) {
    return resPaymentMethodDAO.saveOrUpdate(resPaymentMethod);
  }

  @Override
  public ResPaymentMethod load(Long id) {
    return resPaymentMethodDAO.load(id);

  }


  @Override
  public List<ResPaymentMethod> loadAll() {
    return resPaymentMethodDAO.loadAll();
  }

  @Override
  public List<ResPaymentMethod> loadByNamedQuery(String queryName) {
    return resPaymentMethodDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPaymentMethod> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resPaymentMethodDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPaymentMethod> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPaymentMethodDAO.countAll();

  }

  @Override
  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPaymentMethodDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPaymentMethod> loadAll(Integer startPage, Integer pageSize) {
    return resPaymentMethodDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPaymentMethod> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPaymentMethod> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPaymentMethodDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPaymentMethodDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPaymentMethod> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPaymentMethodDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPaymentMethodDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPaymentMethodDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
