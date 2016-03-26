package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductWasteHistoryService;
import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWasteHistoryDAO;

/**
 * Implementation of ResProductWasteHistoryService
 */
@Service
public class ResProductWasteHistoryServiceImpl implements ResProductWasteHistoryService {


  @Autowired
  private ResProductWasteHistoryDAO resProductWasteHistoryDAO;

  @Override
  public void delete(ResProductWasteHistory resProductWasteHistory) {
    resProductWasteHistoryDAO.delete(resProductWasteHistory);
  }



  @Override
  public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) {
    return resProductWasteHistoryDAO.saveOrUpdate(resProductWasteHistory);
  }

  @Override
  public ResProductWasteHistory load(Long id) {
    return resProductWasteHistoryDAO.load(id);

  }


  @Override
  public List<ResProductWasteHistory> loadAll() {
    return resProductWasteHistoryDAO.loadAll();
  }

  @Override
  public List<ResProductWasteHistory> loadByNamedQuery(String queryName) {
    return resProductWasteHistoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProductWasteHistory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resProductWasteHistoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductWasteHistoryDAO.countAll();

  }

  @Override
  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductWasteHistoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProductWasteHistory> loadAll(Integer startPage, Integer pageSize) {
    return resProductWasteHistoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductWasteHistory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductWasteHistoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductWasteHistoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProductWasteHistory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductWasteHistoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductWasteHistoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductWasteHistoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
