package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReportSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResReportSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReportSettingsDAO;

/**
 * Implementation of ResReportSettingsService
 */
@Service
public class ResReportSettingsServiceImpl implements ResReportSettingsService {


  @Autowired
  private ResReportSettingsDAO resReportSettingsDAO;

  @Override
  public void delete(ResReportSettings resReportSettings) {
    resReportSettingsDAO.delete(resReportSettings);
  }



  @Override
  public ResReportSettings saveOrUpdate(ResReportSettings resReportSettings) {
    return resReportSettingsDAO.saveOrUpdate(resReportSettings);
  }

  @Override
  public ResReportSettings load(Long id) {
    return resReportSettingsDAO.load(id);

  }


  @Override
  public List<ResReportSettings> loadAll() {
    return resReportSettingsDAO.loadAll();
  }

  @Override
  public List<ResReportSettings> loadByNamedQuery(String queryName) {
    return resReportSettingsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReportSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resReportSettingsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReportSettings> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReportSettingsDAO.countAll();

  }

  @Override
  public List<ResReportSettings> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReportSettingsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReportSettings> loadAll(Integer startPage, Integer pageSize) {
    return resReportSettingsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReportSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReportSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReportSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReportSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReportSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReportSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReportSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReportSettings> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReportSettingsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReportSettingsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReportSettingsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
