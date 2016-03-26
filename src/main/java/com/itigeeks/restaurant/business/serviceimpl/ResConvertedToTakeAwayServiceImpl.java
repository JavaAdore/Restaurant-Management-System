package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResConvertedToTakeAwayService;
import com.itigeeks.restaurant.common.entity.schema.ResConvertedToTakeAway;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResConvertedToTakeAwayDAO;

/**
 * Implementation of ResConvertedToTakeAwayService
 */
@Service
public class ResConvertedToTakeAwayServiceImpl implements ResConvertedToTakeAwayService {


  @Autowired
  private ResConvertedToTakeAwayDAO resConvertedToTakeAwayDAO;

  @Override
  public void delete(ResConvertedToTakeAway resConvertedToTakeAway) {
    resConvertedToTakeAwayDAO.delete(resConvertedToTakeAway);
  }



  @Override
  public ResConvertedToTakeAway saveOrUpdate(ResConvertedToTakeAway resConvertedToTakeAway) {
    return resConvertedToTakeAwayDAO.saveOrUpdate(resConvertedToTakeAway);
  }

  @Override
  public ResConvertedToTakeAway load(Long id) {
    return resConvertedToTakeAwayDAO.load(id);

  }


  @Override
  public List<ResConvertedToTakeAway> loadAll() {
    return resConvertedToTakeAwayDAO.loadAll();
  }

  @Override
  public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName) {
    return resConvertedToTakeAwayDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resConvertedToTakeAwayDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResConvertedToTakeAway> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resConvertedToTakeAwayDAO.countAll();

  }

  @Override
  public List<ResConvertedToTakeAway> loadWithAllCriteria(Map<String, Object> criteria) {
    return resConvertedToTakeAwayDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResConvertedToTakeAway> loadAll(Integer startPage, Integer pageSize) {
    return resConvertedToTakeAwayDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResConvertedToTakeAway> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResConvertedToTakeAway> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResConvertedToTakeAway> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResConvertedToTakeAway> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resConvertedToTakeAwayDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResConvertedToTakeAway> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resConvertedToTakeAwayDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResConvertedToTakeAway> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resConvertedToTakeAwayDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resConvertedToTakeAwayDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resConvertedToTakeAwayDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
