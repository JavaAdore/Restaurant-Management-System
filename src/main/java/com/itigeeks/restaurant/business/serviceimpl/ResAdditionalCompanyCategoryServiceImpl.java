package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResAdditionalCompanyCategoryService;
import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyCategoryDAO;

/**
 * Implementation of ResAdditionalCompanyCategoryService
 */
@Service
public class ResAdditionalCompanyCategoryServiceImpl implements ResAdditionalCompanyCategoryService {


  @Autowired
  private ResAdditionalCompanyCategoryDAO resAdditionalCompanyCategoryDAO;

  @Override
  public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory) {
    resAdditionalCompanyCategoryDAO.delete(resAdditionalCompanyCategory);
  }



  @Override
  public ResAdditionalCompanyCategory saveOrUpdate(
      ResAdditionalCompanyCategory resAdditionalCompanyCategory) {
    return resAdditionalCompanyCategoryDAO.saveOrUpdate(resAdditionalCompanyCategory);
  }

  @Override
  public ResAdditionalCompanyCategory load(Long id) {
    return resAdditionalCompanyCategoryDAO.load(id);

  }


  @Override
  public List<ResAdditionalCompanyCategory> loadAll() {
    return resAdditionalCompanyCategoryDAO.loadAll();
  }

  @Override
  public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName) {
    return resAdditionalCompanyCategoryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resAdditionalCompanyCategoryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resAdditionalCompanyCategoryDAO.countAll();

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadWithAllCriteria(Map<String, Object> criteria) {
    return resAdditionalCompanyCategoryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResAdditionalCompanyCategory> loadAll(Integer startPage, Integer pageSize) {
    return resAdditionalCompanyCategoryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResAdditionalCompanyCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resAdditionalCompanyCategoryDAO.load(criteria, startPage, pageSize, sortField,
        ascending, QueryConjunctionType.AND);

  }

  @Override
  public List<ResAdditionalCompanyCategory> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resAdditionalCompanyCategoryDAO.load(criteria, startPage, pageSize, sortField,
        ascending, QueryConjunctionType.OR);

  }



  public List<ResAdditionalCompanyCategory> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resAdditionalCompanyCategoryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resAdditionalCompanyCategoryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resAdditionalCompanyCategoryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
