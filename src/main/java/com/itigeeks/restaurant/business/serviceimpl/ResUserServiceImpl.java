package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResUserService;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResUserDAO;

/**
 * Implementation of ResUserService
 */
@Service
public class ResUserServiceImpl implements ResUserService {


  @Autowired
  private ResUserDAO resUserDAO;

  @Override
  public void delete(ResUser resUser) {
    resUserDAO.delete(resUser);
  }



  @Override
  public ResUser saveOrUpdate(ResUser resUser) {
    return resUserDAO.saveOrUpdate(resUser);
  }

  @Override
  public ResUser load(Long id) {
    return resUserDAO.load(id);

  }


  @Override
  public List<ResUser> loadAll() {
    return resUserDAO.loadAll();
  }

  @Override
  public List<ResUser> loadByNamedQuery(String queryName) {
    return resUserDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resUserDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResUser> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resUserDAO.countAll();

  }

  @Override
  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria) {
    return resUserDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResUser> loadAll(Integer startPage, Integer pageSize) {
    return resUserDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResUser> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resUserDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resUserDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResUser> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resUserDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resUserDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resUserDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
