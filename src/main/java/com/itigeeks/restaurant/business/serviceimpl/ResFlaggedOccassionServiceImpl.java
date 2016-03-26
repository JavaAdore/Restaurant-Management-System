package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResFlaggedOccassionService;
import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFlaggedOccassionDAO;

/**
 * Implementation of ResFlaggedOccassionService
 */
@Service
public class ResFlaggedOccassionServiceImpl implements ResFlaggedOccassionService {


  @Autowired
  private ResFlaggedOccassionDAO resFlaggedOccassionDAO;

  @Override
  public void delete(ResFlaggedOccassion resFlaggedOccassion) {
    resFlaggedOccassionDAO.delete(resFlaggedOccassion);
  }



  @Override
  public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion) {
    return resFlaggedOccassionDAO.saveOrUpdate(resFlaggedOccassion);
  }

  @Override
  public ResFlaggedOccassion load(Long id) {
    return resFlaggedOccassionDAO.load(id);

  }


  @Override
  public List<ResFlaggedOccassion> loadAll() {
    return resFlaggedOccassionDAO.loadAll();
  }

  @Override
  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName) {
    return resFlaggedOccassionDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resFlaggedOccassionDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resFlaggedOccassionDAO.countAll();

  }

  @Override
  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria) {
    return resFlaggedOccassionDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResFlaggedOccassion> loadAll(Integer startPage, Integer pageSize) {
    return resFlaggedOccassionDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResFlaggedOccassion> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resFlaggedOccassionDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resFlaggedOccassionDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResFlaggedOccassion> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resFlaggedOccassionDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resFlaggedOccassionDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resFlaggedOccassionDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
