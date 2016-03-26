package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResMessageStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageStatusDAO;

/**
 * Implementation of ResMessageStatusService
 */
@Service
public class ResMessageStatusServiceImpl implements ResMessageStatusService {


  @Autowired
  private ResMessageStatusDAO resMessageStatusDAO;

  @Override
  public void delete(ResMessageStatus resMessageStatus) {
    resMessageStatusDAO.delete(resMessageStatus);
  }



  @Override
  public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus) {
    return resMessageStatusDAO.saveOrUpdate(resMessageStatus);
  }

  @Override
  public ResMessageStatus load(Long id) {
    return resMessageStatusDAO.load(id);

  }


  @Override
  public List<ResMessageStatus> loadAll() {
    return resMessageStatusDAO.loadAll();
  }

  @Override
  public List<ResMessageStatus> loadByNamedQuery(String queryName) {
    return resMessageStatusDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResMessageStatus> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resMessageStatusDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResMessageStatus> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resMessageStatusDAO.countAll();

  }

  @Override
  public List<ResMessageStatus> loadWithAllCriteria(Map<String, Object> criteria) {
    return resMessageStatusDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResMessageStatus> loadAll(Integer startPage, Integer pageSize) {
    return resMessageStatusDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResMessageStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResMessageStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResMessageStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResMessageStatus> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resMessageStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResMessageStatus> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resMessageStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResMessageStatus> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resMessageStatusDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resMessageStatusDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resMessageStatusDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
