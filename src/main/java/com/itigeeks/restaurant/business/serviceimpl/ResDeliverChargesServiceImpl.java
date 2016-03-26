package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDeliverChargesService;
import com.itigeeks.restaurant.common.entity.schema.ResDeliverCharges;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDeliverChargesDAO;

/**
 * Implementation of ResDeliverChargesService
 */
@Service
public class ResDeliverChargesServiceImpl implements ResDeliverChargesService {


  @Autowired
  private ResDeliverChargesDAO resDeliverChargesDAO;

  @Override
  public void delete(ResDeliverCharges resDeliverCharges) {
    resDeliverChargesDAO.delete(resDeliverCharges);
  }



  @Override
  public ResDeliverCharges saveOrUpdate(ResDeliverCharges resDeliverCharges) {
    return resDeliverChargesDAO.saveOrUpdate(resDeliverCharges);
  }

  @Override
  public ResDeliverCharges load(Long id) {
    return resDeliverChargesDAO.load(id);

  }


  @Override
  public List<ResDeliverCharges> loadAll() {
    return resDeliverChargesDAO.loadAll();
  }

  @Override
  public List<ResDeliverCharges> loadByNamedQuery(String queryName) {
    return resDeliverChargesDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDeliverCharges> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resDeliverChargesDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDeliverCharges> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDeliverChargesDAO.countAll();

  }

  @Override
  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDeliverChargesDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDeliverCharges> loadAll(Integer startPage, Integer pageSize) {
    return resDeliverChargesDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDeliverCharges> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDeliverCharges> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDeliverChargesDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDeliverChargesDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDeliverCharges> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDeliverChargesDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDeliverChargesDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDeliverChargesDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
