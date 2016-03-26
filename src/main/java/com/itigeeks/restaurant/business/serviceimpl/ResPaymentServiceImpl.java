package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPaymentService;
import com.itigeeks.restaurant.common.entity.schema.ResPayment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPaymentDAO;

/**
 * Implementation of ResPaymentService
 */
@Service
public class ResPaymentServiceImpl implements ResPaymentService {


  @Autowired
  private ResPaymentDAO resPaymentDAO;

  @Override
  public void delete(ResPayment resPayment) {
    resPaymentDAO.delete(resPayment);
  }



  @Override
  public ResPayment saveOrUpdate(ResPayment resPayment) {
    return resPaymentDAO.saveOrUpdate(resPayment);
  }

  @Override
  public ResPayment load(Long id) {
    return resPaymentDAO.load(id);

  }


  @Override
  public List<ResPayment> loadAll() {
    return resPaymentDAO.loadAll();
  }

  @Override
  public List<ResPayment> loadByNamedQuery(String queryName) {
    return resPaymentDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resPaymentDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPayment> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPaymentDAO.countAll();

  }

  @Override
  public List<ResPayment> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPaymentDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPayment> loadAll(Integer startPage, Integer pageSize) {
    return resPaymentDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPayment> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPayment> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPayment> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPaymentDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPayment> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPaymentDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPayment> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPaymentDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPaymentDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPaymentDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
