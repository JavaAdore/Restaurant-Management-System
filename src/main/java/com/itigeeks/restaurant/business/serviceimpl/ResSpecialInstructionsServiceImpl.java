package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResSpecialInstructionsService;
import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResSpecialInstructionsDAO;

/**
 * Implementation of ResSpecialInstructionsService
 */
@Service
public class ResSpecialInstructionsServiceImpl implements ResSpecialInstructionsService {


  @Autowired
  private ResSpecialInstructionsDAO resSpecialInstructionsDAO;

  @Override
  public void delete(ResSpecialInstructions resSpecialInstructions) {
    resSpecialInstructionsDAO.delete(resSpecialInstructions);
  }



  @Override
  public ResSpecialInstructions saveOrUpdate(ResSpecialInstructions resSpecialInstructions) {
    return resSpecialInstructionsDAO.saveOrUpdate(resSpecialInstructions);
  }

  @Override
  public ResSpecialInstructions load(Long id) {
    return resSpecialInstructionsDAO.load(id);

  }


  @Override
  public List<ResSpecialInstructions> loadAll() {
    return resSpecialInstructionsDAO.loadAll();
  }

  @Override
  public List<ResSpecialInstructions> loadByNamedQuery(String queryName) {
    return resSpecialInstructionsDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResSpecialInstructions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resSpecialInstructionsDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResSpecialInstructions> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resSpecialInstructionsDAO.countAll();

  }

  @Override
  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria) {
    return resSpecialInstructionsDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResSpecialInstructions> loadAll(Integer startPage, Integer pageSize) {
    return resSpecialInstructionsDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResSpecialInstructions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResSpecialInstructions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resSpecialInstructionsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resSpecialInstructionsDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResSpecialInstructions> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resSpecialInstructionsDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resSpecialInstructionsDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resSpecialInstructionsDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
