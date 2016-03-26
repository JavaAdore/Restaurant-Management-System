package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResTableService;
import com.itigeeks.restaurant.common.entity.schema.ResTable;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTableDAO;

/**
 * Implementation of ResTableService
 */
@Service
public class ResTableServiceImpl implements ResTableService {


  @Autowired
  private ResTableDAO resTableDAO;

  @Override
  public void delete(ResTable resTable) {
    resTableDAO.delete(resTable);
  }



  @Override
  public ResTable saveOrUpdate(ResTable resTable) {
    return resTableDAO.saveOrUpdate(resTable);
  }

  @Override
  public ResTable load(Long id) {
    return resTableDAO.load(id);

  }


  @Override
  public List<ResTable> loadAll() {
    return resTableDAO.loadAll();
  }

  @Override
  public List<ResTable> loadByNamedQuery(String queryName) {
    return resTableDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resTableDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResTable> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resTableDAO.countAll();

  }

  @Override
  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria) {
    return resTableDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResTable> loadAll(Integer startPage, Integer pageSize) {
    return resTableDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResTable> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResTable> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resTableDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resTableDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResTable> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resTableDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resTableDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resTableDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
