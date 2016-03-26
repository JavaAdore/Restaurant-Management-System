package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResButtonPermissionSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionSettingsDAO;

/**
 * Implementation of ResButtonPermissionSettingsService
 */
@Service
public class ResButtonPermissionSettingsServiceImpl implements ResButtonPermissionSettingsService {


  @Autowired
  private ResButtonPermissionSettingsDAO resButtonPermissionSettingsDAO;

  @Override
  public void delete(ResButtonPermissionSettings resButtonPermissionSettings) {
    resButtonPermissionSettingsDAO.delete(resButtonPermissionSettings);
  }



  @Override
  public ResButtonPermissionSettings saveOrUpdate(
      ResButtonPermissionSettings resButtonPermissionSettings) {
    return resButtonPermissionSettingsDAO.saveOrUpdate(resButtonPermissionSettings);
  }

  @Override
  public ResButtonPermissionSettings load(Long id) {
    return resButtonPermissionSettingsDAO.load(id);

  }


  @Override
  public List<ResButtonPermissionSettings> loadAll() {
    return resButtonPermissionSettingsDAO.loadAll();
  }

  @Override
  public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName) {
    return resButtonPermissionSettingsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resButtonPermissionSettingsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resButtonPermissionSettingsDAO.countAll();

  }

  @Override
  public List<ResButtonPermissionSettings> loadWithAllCriteria(Map<String, Object> criteria) {
    return resButtonPermissionSettingsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResButtonPermissionSettings> loadAll(Integer startPage, Integer pageSize) {
    return resButtonPermissionSettingsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resButtonPermissionSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResButtonPermissionSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resButtonPermissionSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResButtonPermissionSettings> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resButtonPermissionSettingsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resButtonPermissionSettingsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resButtonPermissionSettingsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
