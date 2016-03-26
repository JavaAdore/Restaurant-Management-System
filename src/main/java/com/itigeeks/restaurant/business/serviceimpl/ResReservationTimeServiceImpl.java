package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationTimeService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationTimeDAO;

/**
 * Implementation of ResReservationTimeService
 */
@Service
public class ResReservationTimeServiceImpl implements ResReservationTimeService {


  @Autowired
  private ResReservationTimeDAO resReservationTimeDAO;

  @Override
  public void delete(ResReservationTime resReservationTime) {
    resReservationTimeDAO.delete(resReservationTime);
  }



  @Override
  public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime) {
    return resReservationTimeDAO.saveOrUpdate(resReservationTime);
  }

  @Override
  public ResReservationTime load(Long id) {
    return resReservationTimeDAO.load(id);

  }


  @Override
  public List<ResReservationTime> loadAll() {
    return resReservationTimeDAO.loadAll();
  }

  @Override
  public List<ResReservationTime> loadByNamedQuery(String queryName) {
    return resReservationTimeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReservationTime> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resReservationTimeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReservationTimeDAO.countAll();

  }

  @Override
  public List<ResReservationTime> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReservationTimeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReservationTime> loadAll(Integer startPage, Integer pageSize) {
    return resReservationTimeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationTime> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationTime> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationTime> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationTimeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationTime> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationTimeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReservationTime> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationTimeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReservationTimeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationTimeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
