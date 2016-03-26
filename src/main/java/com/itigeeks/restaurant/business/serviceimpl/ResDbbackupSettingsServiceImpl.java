package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResDbbackupSettingsService;
import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDbbackupSettingsDAO;

/**
 * Implementation of ResDbbackupSettingsService
 */
@Service
public class ResDbbackupSettingsServiceImpl implements ResDbbackupSettingsService {


  @Autowired
  private ResDbbackupSettingsDAO resDbbackupSettingsDAO;

  @Override
  public void delete(ResDbbackupSettings resDbbackupSettings) {
    resDbbackupSettingsDAO.delete(resDbbackupSettings);
  }



  @Override
  public ResDbbackupSettings saveOrUpdate(ResDbbackupSettings resDbbackupSettings) {
    return resDbbackupSettingsDAO.saveOrUpdate(resDbbackupSettings);
  }

  @Override
  public ResDbbackupSettings load(Long id) {
    return resDbbackupSettingsDAO.load(id);

  }


  @Override
  public List<ResDbbackupSettings> loadAll() {
    return resDbbackupSettingsDAO.loadAll();
  }

  @Override
  public List<ResDbbackupSettings> loadByNamedQuery(String queryName) {
    return resDbbackupSettingsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResDbbackupSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resDbbackupSettingsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resDbbackupSettingsDAO.countAll();

  }

  @Override
  public List<ResDbbackupSettings> loadWithAllCriteria(Map<String, Object> criteria) {
    return resDbbackupSettingsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResDbbackupSettings> loadAll(Integer startPage, Integer pageSize) {
    return resDbbackupSettingsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDbbackupSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDbbackupSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResDbbackupSettings> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDbbackupSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResDbbackupSettings> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resDbbackupSettingsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResDbbackupSettings> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resDbbackupSettingsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resDbbackupSettingsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resDbbackupSettingsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
