package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrintBlockCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResPrintBlockCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockCategoryDAO;

/**
 * Implementation of ResPrintBlockCategoryService
 */
@Service
public class ResPrintBlockCategoryServiceImpl implements ResPrintBlockCategoryService {


  @Autowired
  private ResPrintBlockCategoryDAO resPrintBlockCategoryDAO;

  @Override
  public void delete(ResPrintBlockCategory resPrintBlockCategory) {
    resPrintBlockCategoryDAO.delete(resPrintBlockCategory);
  }



  @Override
  public ResPrintBlockCategory saveOrUpdate(ResPrintBlockCategory resPrintBlockCategory) {
    return resPrintBlockCategoryDAO.saveOrUpdate(resPrintBlockCategory);
  }

  @Override
  public ResPrintBlockCategory load(Long id) {
    return resPrintBlockCategoryDAO.load(id);

  }


  @Override
  public List<ResPrintBlockCategory> loadAll() {
    return resPrintBlockCategoryDAO.loadAll();
  }

  @Override
  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName) {
    return resPrintBlockCategoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resPrintBlockCategoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPrintBlockCategoryDAO.countAll();

  }

  @Override
  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPrintBlockCategoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPrintBlockCategory> loadAll(Integer startPage, Integer pageSize) {
    return resPrintBlockCategoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlockCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPrintBlockCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPrintBlockCategoryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPrintBlockCategory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPrintBlockCategoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPrintBlockCategoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPrintBlockCategoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
