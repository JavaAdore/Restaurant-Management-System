package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationConfirmationService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationConfirmationDAO;

/**
 * Implementation of ResReservationConfirmationService
 */
@Service
public class ResReservationConfirmationServiceImpl implements ResReservationConfirmationService {


  @Autowired
  private ResReservationConfirmationDAO resReservationConfirmationDAO;

  @Override
  public void delete(ResReservationConfirmation resReservationConfirmation) {
    resReservationConfirmationDAO.delete(resReservationConfirmation);
  }



  @Override
  public ResReservationConfirmation saveOrUpdate(
      ResReservationConfirmation resReservationConfirmation) {
    return resReservationConfirmationDAO.saveOrUpdate(resReservationConfirmation);
  }

  @Override
  public ResReservationConfirmation load(Long id) {
    return resReservationConfirmationDAO.load(id);

  }


  @Override
  public List<ResReservationConfirmation> loadAll() {
    return resReservationConfirmationDAO.loadAll();
  }

  @Override
  public List<ResReservationConfirmation> loadByNamedQuery(String queryName) {
    return resReservationConfirmationDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReservationConfirmation> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resReservationConfirmationDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReservationConfirmation> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReservationConfirmationDAO.countAll();

  }

  @Override
  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReservationConfirmationDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReservationConfirmation> loadAll(Integer startPage, Integer pageSize) {
    return resReservationConfirmationDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReservationConfirmation> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationConfirmation> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationConfirmationDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationConfirmationDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReservationConfirmation> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationConfirmationDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReservationConfirmationDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationConfirmationDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
