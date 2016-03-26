package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResAddonService;
import com.itigeeks.restaurant.common.entity.schema.ResAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAddonDAO;

/**
 * Implementation of ResAddonService
 */
@Service
public class ResAddonServiceImpl implements ResAddonService {


  @Autowired
  private ResAddonDAO resAddonDAO;

  @Override
  public void delete(ResAddon resAddon) {
    resAddonDAO.delete(resAddon);
  }



  @Override
  public ResAddon saveOrUpdate(ResAddon resAddon) {
    return resAddonDAO.saveOrUpdate(resAddon);
  }

  @Override
  public ResAddon load(Long id) {
    return resAddonDAO.load(id);

  }


  @Override
  public List<ResAddon> loadAll() {
    return resAddonDAO.loadAll();
  }

  @Override
  public List<ResAddon> loadByNamedQuery(String queryName) {
    return resAddonDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resAddonDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResAddon> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resAddonDAO.countAll();

  }

  @Override
  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria) {
    return resAddonDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResAddon> loadAll(Integer startPage, Integer pageSize) {
    return resAddonDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResAddon> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResAddon> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resAddonDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resAddonDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResAddon> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resAddonDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resAddonDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resAddonDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
