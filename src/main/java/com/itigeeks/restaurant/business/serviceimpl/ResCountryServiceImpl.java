package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCountryService;
import com.itigeeks.restaurant.common.entity.schema.ResCountry;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCountryDAO;

/**
 * Implementation of ResCountryService
 */
@Service
public class ResCountryServiceImpl implements ResCountryService {


  @Autowired
  private ResCountryDAO resCountryDAO;

  @Override
  public void delete(ResCountry resCountry) {
    resCountryDAO.delete(resCountry);
  }



  @Override
  public ResCountry saveOrUpdate(ResCountry resCountry) {
    return resCountryDAO.saveOrUpdate(resCountry);
  }

  @Override
  public ResCountry load(Long id) {
    return resCountryDAO.load(id);

  }


  @Override
  public List<ResCountry> loadAll() {
    return resCountryDAO.loadAll();
  }

  @Override
  public List<ResCountry> loadByNamedQuery(String queryName) {
    return resCountryDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resCountryDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCountry> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCountryDAO.countAll();

  }

  @Override
  public List<ResCountry> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCountryDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCountry> loadAll(Integer startPage, Integer pageSize) {
    return resCountryDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCountry> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCountry> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCountry> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCountry> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCountryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCountry> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resCountryDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCountry> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCountryDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCountryDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCountryDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
