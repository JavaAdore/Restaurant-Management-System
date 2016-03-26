package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderStatusService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderStatusDAO;

/**
 * Implementation of ResOrderStatusService
 */
@Service
public class ResOrderStatusServiceImpl implements ResOrderStatusService {


  @Autowired
  private ResOrderStatusDAO resOrderStatusDAO;

  @Override
  public void delete(ResOrderStatus resOrderStatus) {
    resOrderStatusDAO.delete(resOrderStatus);
  }



  @Override
  public ResOrderStatus saveOrUpdate(ResOrderStatus resOrderStatus) {
    return resOrderStatusDAO.saveOrUpdate(resOrderStatus);
  }

  @Override
  public ResOrderStatus load(Long id) {
    return resOrderStatusDAO.load(id);

  }


  @Override
  public List<ResOrderStatus> loadAll() {
    return resOrderStatusDAO.loadAll();
  }

  @Override
  public List<ResOrderStatus> loadByNamedQuery(String queryName) {
    return resOrderStatusDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResOrderStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resOrderStatusDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResOrderStatus> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resOrderStatusDAO.countAll();

  }

  @Override
  public List<ResOrderStatus> loadWithAllCriteria(Map<String, Object> criteria) {
    return resOrderStatusDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResOrderStatus> loadAll(Integer startPage, Integer pageSize) {
    return resOrderStatusDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResOrderStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderStatus> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderStatus> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderStatus> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resOrderStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderStatus> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resOrderStatusDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResOrderStatus> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderStatusDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resOrderStatusDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderStatusDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
