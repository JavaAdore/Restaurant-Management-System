package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResOrderCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderCategoryDAO;

/**
 * Implementation of ResOrderCategoryService
 */
@Service
public class ResOrderCategoryServiceImpl implements ResOrderCategoryService {


  @Autowired
  private ResOrderCategoryDAO resOrderCategoryDAO;

  @Override
  public void delete(ResOrderCategory resOrderCategory) {
    resOrderCategoryDAO.delete(resOrderCategory);
  }



  @Override
  public ResOrderCategory saveOrUpdate(ResOrderCategory resOrderCategory) {
    return resOrderCategoryDAO.saveOrUpdate(resOrderCategory);
  }

  @Override
  public ResOrderCategory load(Long id) {
    return resOrderCategoryDAO.load(id);

  }


  @Override
  public List<ResOrderCategory> loadAll() {
    return resOrderCategoryDAO.loadAll();
  }

  @Override
  public List<ResOrderCategory> loadByNamedQuery(String queryName) {
    return resOrderCategoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResOrderCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resOrderCategoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resOrderCategoryDAO.countAll();

  }

  @Override
  public List<ResOrderCategory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resOrderCategoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResOrderCategory> loadAll(Integer startPage, Integer pageSize) {
    return resOrderCategoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResOrderCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resOrderCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resOrderCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderCategoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resOrderCategoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resOrderCategoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
