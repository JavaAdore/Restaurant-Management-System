package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDeliveryChargesService;
import com.itigeeks.restaurant.common.entity.schema.ResDeliveryCharges;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDeliveryChargesDAO;

/**
 * Implementation of ResDeliveryChargesService
 */
@Service
public class ResDeliveryChargesServiceImpl implements ResDeliveryChargesService {


  @Autowired
  private ResDeliveryChargesDAO resDeliveryChargesDAO;

  @Override
  public void delete(ResDeliveryCharges resDeliveryCharges) {
    resDeliveryChargesDAO.delete(resDeliveryCharges);
  }



  @Override
  public ResDeliveryCharges saveOrUpdate(ResDeliveryCharges resDeliveryCharges) {
    return resDeliveryChargesDAO.saveOrUpdate(resDeliveryCharges);
  }

  @Override
  public ResDeliveryCharges load(Long id) {
    return resDeliveryChargesDAO.load(id);

  }


  @Override
  public List<ResDeliveryCharges> loadAll() {
    return resDeliveryChargesDAO.loadAll();
  }

  @Override
  public List<ResDeliveryCharges> loadByNamedQuery(String queryName) {
    return resDeliveryChargesDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDeliveryCharges> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resDeliveryChargesDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDeliveryCharges> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDeliveryChargesDAO.countAll();

  }

  @Override
  public List<ResDeliveryCharges> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDeliveryChargesDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDeliveryCharges> loadAll(Integer startPage, Integer pageSize) {
    return resDeliveryChargesDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDeliveryCharges> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliveryCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliveryCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliveryCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDeliveryChargesDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDeliveryCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDeliveryChargesDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDeliveryCharges> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDeliveryChargesDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDeliveryChargesDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDeliveryChargesDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
