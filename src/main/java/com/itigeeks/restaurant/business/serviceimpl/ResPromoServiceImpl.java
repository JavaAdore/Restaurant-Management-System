package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromoService;
import com.itigeeks.restaurant.common.entity.schema.ResPromo;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromoDAO;

/**
 * Implementation of ResPromoService
 */
@Service
public class ResPromoServiceImpl implements ResPromoService {


  @Autowired
  private ResPromoDAO resPromoDAO;

  @Override
  public void delete(ResPromo resPromo) {
    resPromoDAO.delete(resPromo);
  }



  @Override
  public ResPromo saveOrUpdate(ResPromo resPromo) {
    return resPromoDAO.saveOrUpdate(resPromo);
  }

  @Override
  public ResPromo load(Long id) {
    return resPromoDAO.load(id);

  }


  @Override
  public List<ResPromo> loadAll() {
    return resPromoDAO.loadAll();
  }

  @Override
  public List<ResPromo> loadByNamedQuery(String queryName) {
    return resPromoDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPromo> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resPromoDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPromo> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPromoDAO.countAll();

  }

  @Override
  public List<ResPromo> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPromoDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPromo> loadAll(Integer startPage, Integer pageSize) {
    return resPromoDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPromo> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromo> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromo> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromo> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPromoDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPromo> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPromoDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPromo> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPromoDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPromoDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPromoDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
