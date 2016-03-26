package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationTypeDAO;

/**
 * Implementation of ResReservationTypeService
 */
@Service
public class ResReservationTypeServiceImpl implements ResReservationTypeService {


  @Autowired
  private ResReservationTypeDAO resReservationTypeDAO;

  @Override
  public void delete(ResReservationType resReservationType) {
    resReservationTypeDAO.delete(resReservationType);
  }



  @Override
  public ResReservationType saveOrUpdate(ResReservationType resReservationType) {
    return resReservationTypeDAO.saveOrUpdate(resReservationType);
  }

  @Override
  public ResReservationType load(Long id) {
    return resReservationTypeDAO.load(id);

  }


  @Override
  public List<ResReservationType> loadAll() {
    return resReservationTypeDAO.loadAll();
  }

  @Override
  public List<ResReservationType> loadByNamedQuery(String queryName) {
    return resReservationTypeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReservationType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resReservationTypeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReservationType> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReservationTypeDAO.countAll();

  }

  @Override
  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReservationTypeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReservationType> loadAll(Integer startPage, Integer pageSize) {
    return resReservationTypeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReservationType> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationTypeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReservationTypeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationTypeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
