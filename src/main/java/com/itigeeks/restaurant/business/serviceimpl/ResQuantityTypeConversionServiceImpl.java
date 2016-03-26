package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResQuantityTypeConversionService;
import com.itigeeks.restaurant.common.entity.schema.ResQuantityTypeConversion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResQuantityTypeConversionDAO;

/**
 * Implementation of ResQuantityTypeConversionService
 */
@Service
public class ResQuantityTypeConversionServiceImpl implements ResQuantityTypeConversionService {


  @Autowired
  private ResQuantityTypeConversionDAO resQuantityTypeConversionDAO;

  @Override
  public void delete(ResQuantityTypeConversion resQuantityTypeConversion) {
    resQuantityTypeConversionDAO.delete(resQuantityTypeConversion);
  }



  @Override
  public ResQuantityTypeConversion saveOrUpdate(ResQuantityTypeConversion resQuantityTypeConversion) {
    return resQuantityTypeConversionDAO.saveOrUpdate(resQuantityTypeConversion);
  }

  @Override
  public ResQuantityTypeConversion load(Long id) {
    return resQuantityTypeConversionDAO.load(id);

  }


  @Override
  public List<ResQuantityTypeConversion> loadAll() {
    return resQuantityTypeConversionDAO.loadAll();
  }

  @Override
  public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName) {
    return resQuantityTypeConversionDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resQuantityTypeConversionDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResQuantityTypeConversion> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resQuantityTypeConversionDAO.countAll();

  }

  @Override
  public List<ResQuantityTypeConversion> loadWithAllCriteria(Map<String, Object> criteria) {
    return resQuantityTypeConversionDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResQuantityTypeConversion> loadAll(Integer startPage, Integer pageSize) {
    return resQuantityTypeConversionDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResQuantityTypeConversion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityTypeConversion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityTypeConversion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResQuantityTypeConversion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resQuantityTypeConversionDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResQuantityTypeConversion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resQuantityTypeConversionDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResQuantityTypeConversion> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resQuantityTypeConversionDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resQuantityTypeConversionDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resQuantityTypeConversionDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
