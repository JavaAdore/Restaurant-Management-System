package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResTableTransactionsService;
import com.itigeeks.restaurant.common.entity.schema.ResTableTransactions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTableTransactionsDAO;

/**
 * Implementation of ResTableTransactionsService
 */
@Service
public class ResTableTransactionsServiceImpl implements ResTableTransactionsService {


  @Autowired
  private ResTableTransactionsDAO resTableTransactionsDAO;

  @Override
  public void delete(ResTableTransactions resTableTransactions) {
    resTableTransactionsDAO.delete(resTableTransactions);
  }



  @Override
  public ResTableTransactions saveOrUpdate(ResTableTransactions resTableTransactions) {
    return resTableTransactionsDAO.saveOrUpdate(resTableTransactions);
  }

  @Override
  public ResTableTransactions load(Long id) {
    return resTableTransactionsDAO.load(id);

  }


  @Override
  public List<ResTableTransactions> loadAll() {
    return resTableTransactionsDAO.loadAll();
  }

  @Override
  public List<ResTableTransactions> loadByNamedQuery(String queryName) {
    return resTableTransactionsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResTableTransactions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resTableTransactionsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resTableTransactionsDAO.countAll();

  }

  @Override
  public List<ResTableTransactions> loadWithAllCriteria(Map<String, Object> criteria) {
    return resTableTransactionsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResTableTransactions> loadAll(Integer startPage, Integer pageSize) {
    return resTableTransactionsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTableTransactions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTableTransactions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTableTransactions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resTableTransactionsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResTableTransactions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resTableTransactionsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResTableTransactions> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resTableTransactionsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resTableTransactionsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resTableTransactionsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
