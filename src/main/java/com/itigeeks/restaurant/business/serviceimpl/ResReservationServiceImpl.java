package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationService;
import com.itigeeks.restaurant.common.entity.schema.ResReservation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationDAO;

/**
 * Implementation of ResReservationService
 */
@Service
public class ResReservationServiceImpl implements ResReservationService {


  @Autowired
  private ResReservationDAO resReservationDAO;

  @Override
  public void delete(ResReservation resReservation) {
    resReservationDAO.delete(resReservation);
  }



  @Override
  public ResReservation saveOrUpdate(ResReservation resReservation) {
    return resReservationDAO.saveOrUpdate(resReservation);
  }

  @Override
  public ResReservation load(Long id) {
    return resReservationDAO.load(id);

  }


  @Override
  public List<ResReservation> loadAll() {
    return resReservationDAO.loadAll();
  }

  @Override
  public List<ResReservation> loadByNamedQuery(String queryName) {
    return resReservationDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReservation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resReservationDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReservation> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReservationDAO.countAll();

  }

  @Override
  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReservationDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReservation> loadAll(Integer startPage, Integer pageSize) {
    return resReservationDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReservation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservation> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resReservationDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resReservationDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReservation> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReservationDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
