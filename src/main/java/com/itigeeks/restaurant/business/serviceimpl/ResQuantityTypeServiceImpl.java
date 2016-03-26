package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResQuantityTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResQuantityType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResQuantityTypeDAO;

/**
 * Implementation of ResQuantityTypeService
 */
@Service
public class ResQuantityTypeServiceImpl implements ResQuantityTypeService {


  @Autowired
  private ResQuantityTypeDAO resQuantityTypeDAO;

  @Override
  public void delete(ResQuantityType resQuantityType) {
    resQuantityTypeDAO.delete(resQuantityType);
  }



  @Override
  public ResQuantityType saveOrUpdate(ResQuantityType resQuantityType) {
    return resQuantityTypeDAO.saveOrUpdate(resQuantityType);
  }

  @Override
  public ResQuantityType load(Long id) {
    return resQuantityTypeDAO.load(id);

  }


  @Override
  public List<ResQuantityType> loadAll() {
    return resQuantityTypeDAO.loadAll();
  }

  @Override
  public List<ResQuantityType> loadByNamedQuery(String queryName) {
    return resQuantityTypeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResQuantityType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resQuantityTypeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResQuantityType> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resQuantityTypeDAO.countAll();

  }

  @Override
  public List<ResQuantityType> loadWithAllCriteria(Map<String, Object> criteria) {
    return resQuantityTypeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResQuantityType> loadAll(Integer startPage, Integer pageSize) {
    return resQuantityTypeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResQuantityType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityType> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resQuantityTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResQuantityType> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resQuantityTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResQuantityType> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resQuantityTypeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resQuantityTypeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resQuantityTypeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
