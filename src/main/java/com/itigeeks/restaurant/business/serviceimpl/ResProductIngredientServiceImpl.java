package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResProductIngredientService;
import com.itigeeks.restaurant.common.entity.schema.ResProductIngredient;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductIngredientDAO;

/**
 * Implementation of ResProductIngredientService
 */
@Service
public class ResProductIngredientServiceImpl implements ResProductIngredientService {


  @Autowired
  private ResProductIngredientDAO resProductIngredientDAO;

  @Override
  public void delete(ResProductIngredient resProductIngredient) {
    resProductIngredientDAO.delete(resProductIngredient);
  }



  @Override
  public ResProductIngredient saveOrUpdate(ResProductIngredient resProductIngredient) {
    return resProductIngredientDAO.saveOrUpdate(resProductIngredient);
  }

  @Override
  public ResProductIngredient load(Long id) {
    return resProductIngredientDAO.load(id);

  }


  @Override
  public List<ResProductIngredient> loadAll() {
    return resProductIngredientDAO.loadAll();
  }

  @Override
  public List<ResProductIngredient> loadByNamedQuery(String queryName) {
    return resProductIngredientDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResProductIngredient> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resProductIngredientDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resProductIngredientDAO.countAll();

  }

  @Override
  public List<ResProductIngredient> loadWithAllCriteria(Map<String, Object> criteria) {
    return resProductIngredientDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResProductIngredient> loadAll(Integer startPage, Integer pageSize) {
    return resProductIngredientDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductIngredient> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductIngredient> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResProductIngredient> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductIngredientDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductIngredient> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resProductIngredientDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResProductIngredient> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resProductIngredientDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resProductIngredientDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resProductIngredientDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
