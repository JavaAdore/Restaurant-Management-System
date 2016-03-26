package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductPurchaseHistoryService;
import com.itigeeks.restaurant.common.entity.schema.ResProductPurchaseHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductPurchaseHistoryDAO;

/**
 * Implementation of ResProductPurchaseHistoryService
 */
@Service
public class ResProductPurchaseHistoryServiceImpl implements ResProductPurchaseHistoryService {


  @Autowired
  private ResProductPurchaseHistoryDAO resProductPurchaseHistoryDAO;

  @Override
  public void delete(ResProductPurchaseHistory resProductPurchaseHistory) {
    resProductPurchaseHistoryDAO.delete(resProductPurchaseHistory);
  }



  @Override
  public ResProductPurchaseHistory saveOrUpdate(ResProductPurchaseHistory resProductPurchaseHistory) {
    return resProductPurchaseHistoryDAO.saveOrUpdate(resProductPurchaseHistory);
  }

  @Override
  public ResProductPurchaseHistory load(Long id) {
    return resProductPurchaseHistoryDAO.load(id);

  }


  @Override
  public List<ResProductPurchaseHistory> loadAll() {
    return resProductPurchaseHistoryDAO.loadAll();
  }

  @Override
  public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName) {
    return resProductPurchaseHistoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resProductPurchaseHistoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductPurchaseHistoryDAO.countAll();

  }

  @Override
  public List<ResProductPurchaseHistory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductPurchaseHistoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProductPurchaseHistory> loadAll(Integer startPage, Integer pageSize) {
    return resProductPurchaseHistoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductPurchaseHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductPurchaseHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductPurchaseHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductPurchaseHistoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductPurchaseHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductPurchaseHistoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProductPurchaseHistory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductPurchaseHistoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductPurchaseHistoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductPurchaseHistoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
