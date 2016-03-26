package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDashboardSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDashboardSettingsDAO;

/**
 * Implementation of ResDashboardSettingsService
 */
@Service
public class ResDashboardSettingsServiceImpl implements ResDashboardSettingsService {


  @Autowired
  private ResDashboardSettingsDAO resDashboardSettingsDAO;

  @Override
  public void delete(ResDashboardSettings resDashboardSettings) {
    resDashboardSettingsDAO.delete(resDashboardSettings);
  }



  @Override
  public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings) {
    return resDashboardSettingsDAO.saveOrUpdate(resDashboardSettings);
  }

  @Override
  public ResDashboardSettings load(Long id) {
    return resDashboardSettingsDAO.load(id);

  }


  @Override
  public List<ResDashboardSettings> loadAll() {
    return resDashboardSettingsDAO.loadAll();
  }

  @Override
  public List<ResDashboardSettings> loadByNamedQuery(String queryName) {
    return resDashboardSettingsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDashboardSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resDashboardSettingsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDashboardSettingsDAO.countAll();

  }

  @Override
  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDashboardSettingsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDashboardSettings> loadAll(Integer startPage, Integer pageSize) {
    return resDashboardSettingsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDashboardSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDashboardSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDashboardSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDashboardSettings> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDashboardSettingsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDashboardSettingsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDashboardSettingsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
