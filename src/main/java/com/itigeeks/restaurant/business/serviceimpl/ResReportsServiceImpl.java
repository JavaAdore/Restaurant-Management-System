package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReportsService;
import com.itigeeks.restaurant.common.entity.schema.ResReports;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReportsDAO;

/**
 * Implementation of ResReportsService
 */
@Service
public class ResReportsServiceImpl implements ResReportsService {


  @Autowired
  private ResReportsDAO resReportsDAO;

  @Override
  public void delete(ResReports resReports) {
    resReportsDAO.delete(resReports);
  }



  @Override
  public ResReports saveOrUpdate(ResReports resReports) {
    return resReportsDAO.saveOrUpdate(resReports);
  }

  @Override
  public ResReports load(Long id) {
    return resReportsDAO.load(id);

  }


  @Override
  public List<ResReports> loadAll() {
    return resReportsDAO.loadAll();
  }

  @Override
  public List<ResReports> loadByNamedQuery(String queryName) {
    return resReportsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReports> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resReportsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReports> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReportsDAO.countAll();

  }

  @Override
  public List<ResReports> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReportsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReports> loadAll(Integer startPage, Integer pageSize) {
    return resReportsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReports> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReports> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReports> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReports> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resReportsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReports> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resReportsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReports> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReportsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReportsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReportsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
