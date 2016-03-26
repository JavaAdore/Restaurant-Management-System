package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderActionTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderActionTypeDAO;

/**
 * Implementation of ResOrderActionTypeService
 */
@Service
public class ResOrderActionTypeServiceImpl implements ResOrderActionTypeService {


  @Autowired
  private ResOrderActionTypeDAO resOrderActionTypeDAO;

  @Override
  public void delete(ResOrderActionType resOrderActionType) {
    resOrderActionTypeDAO.delete(resOrderActionType);
  }



  @Override
  public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType) {
    return resOrderActionTypeDAO.saveOrUpdate(resOrderActionType);
  }

  @Override
  public ResOrderActionType load(Long id) {
    return resOrderActionTypeDAO.load(id);

  }


  @Override
  public List<ResOrderActionType> loadAll() {
    return resOrderActionTypeDAO.loadAll();
  }

  @Override
  public List<ResOrderActionType> loadByNamedQuery(String queryName) {
    return resOrderActionTypeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResOrderActionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resOrderActionTypeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResOrderActionType> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resOrderActionTypeDAO.countAll();

  }

  @Override
  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria) {
    return resOrderActionTypeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResOrderActionType> loadAll(Integer startPage, Integer pageSize) {
    return resOrderActionTypeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResOrderActionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderActionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resOrderActionTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resOrderActionTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResOrderActionType> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderActionTypeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resOrderActionTypeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderActionTypeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
