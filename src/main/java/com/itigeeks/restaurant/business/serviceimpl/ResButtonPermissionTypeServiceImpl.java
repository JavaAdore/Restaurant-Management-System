package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResButtonPermissionTypeService;
import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionTypeDAO;

/**
 * Implementation of ResButtonPermissionTypeService
 */
@Service
public class ResButtonPermissionTypeServiceImpl implements ResButtonPermissionTypeService {


  @Autowired
  private ResButtonPermissionTypeDAO resButtonPermissionTypeDAO;

  @Override
  public void delete(ResButtonPermissionType resButtonPermissionType) {
    resButtonPermissionTypeDAO.delete(resButtonPermissionType);
  }



  @Override
  public ResButtonPermissionType saveOrUpdate(ResButtonPermissionType resButtonPermissionType) {
    return resButtonPermissionTypeDAO.saveOrUpdate(resButtonPermissionType);
  }

  @Override
  public ResButtonPermissionType load(Long id) {
    return resButtonPermissionTypeDAO.load(id);

  }


  @Override
  public List<ResButtonPermissionType> loadAll() {
    return resButtonPermissionTypeDAO.loadAll();
  }

  @Override
  public List<ResButtonPermissionType> loadByNamedQuery(String queryName) {
    return resButtonPermissionTypeDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResButtonPermissionType> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resButtonPermissionTypeDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResButtonPermissionType> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resButtonPermissionTypeDAO.countAll();

  }

  @Override
  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria) {
    return resButtonPermissionTypeDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResButtonPermissionType> loadAll(Integer startPage, Integer pageSize) {
    return resButtonPermissionTypeDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResButtonPermissionType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResButtonPermissionType> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resButtonPermissionTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resButtonPermissionTypeDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResButtonPermissionType> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resButtonPermissionTypeDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resButtonPermissionTypeDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resButtonPermissionTypeDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
