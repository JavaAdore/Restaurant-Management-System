package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCustomerMessageService;
import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerMessageDAO;

/**
 * Implementation of ResCustomerMessageService
 */
@Service
public class ResCustomerMessageServiceImpl implements ResCustomerMessageService {


  @Autowired
  private ResCustomerMessageDAO resCustomerMessageDAO;

  @Override
  public void delete(ResCustomerMessage resCustomerMessage) {
    resCustomerMessageDAO.delete(resCustomerMessage);
  }



  @Override
  public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage) {
    return resCustomerMessageDAO.saveOrUpdate(resCustomerMessage);
  }

  @Override
  public ResCustomerMessage load(Long id) {
    return resCustomerMessageDAO.load(id);

  }


  @Override
  public List<ResCustomerMessage> loadAll() {
    return resCustomerMessageDAO.loadAll();
  }

  @Override
  public List<ResCustomerMessage> loadByNamedQuery(String queryName) {
    return resCustomerMessageDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCustomerMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resCustomerMessageDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCustomerMessageDAO.countAll();

  }

  @Override
  public List<ResCustomerMessage> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCustomerMessageDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCustomerMessage> loadAll(Integer startPage, Integer pageSize) {
    return resCustomerMessageDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCustomerMessageDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCustomerMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCustomerMessageDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCustomerMessage> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCustomerMessageDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCustomerMessageDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCustomerMessageDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
