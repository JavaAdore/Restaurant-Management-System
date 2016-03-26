package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCategoryOrderCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResCategoryOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryOrderCategoryDAO;

/**
 * Implementation of ResCategoryOrderCategoryService
 */
@Service
public class ResCategoryOrderCategoryServiceImpl implements ResCategoryOrderCategoryService {


  @Autowired
  private ResCategoryOrderCategoryDAO resCategoryOrderCategoryDAO;

  @Override
  public void delete(ResCategoryOrderCategory resCategoryOrderCategory) {
    resCategoryOrderCategoryDAO.delete(resCategoryOrderCategory);
  }



  @Override
  public ResCategoryOrderCategory saveOrUpdate(ResCategoryOrderCategory resCategoryOrderCategory) {
    return resCategoryOrderCategoryDAO.saveOrUpdate(resCategoryOrderCategory);
  }

  @Override
  public ResCategoryOrderCategory load(Long id) {
    return resCategoryOrderCategoryDAO.load(id);

  }


  @Override
  public List<ResCategoryOrderCategory> loadAll() {
    return resCategoryOrderCategoryDAO.loadAll();
  }

  @Override
  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName) {
    return resCategoryOrderCategoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resCategoryOrderCategoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCategoryOrderCategoryDAO.countAll();

  }

  @Override
  public List<ResCategoryOrderCategory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCategoryOrderCategoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCategoryOrderCategory> loadAll(Integer startPage, Integer pageSize) {
    return resCategoryOrderCategoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategoryOrderCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategoryOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCategoryOrderCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCategoryOrderCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCategoryOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCategoryOrderCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCategoryOrderCategory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCategoryOrderCategoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCategoryOrderCategoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCategoryOrderCategoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
