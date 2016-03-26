package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPredefinedMessageService;
import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPredefinedMessageDAO;

/**
 * Implementation of ResPredefinedMessageService
 */
@Service
public class ResPredefinedMessageServiceImpl implements ResPredefinedMessageService {


  @Autowired
  private ResPredefinedMessageDAO resPredefinedMessageDAO;

  @Override
  public void delete(ResPredefinedMessage resPredefinedMessage) {
    resPredefinedMessageDAO.delete(resPredefinedMessage);
  }



  @Override
  public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage) {
    return resPredefinedMessageDAO.saveOrUpdate(resPredefinedMessage);
  }

  @Override
  public ResPredefinedMessage load(Long id) {
    return resPredefinedMessageDAO.load(id);

  }


  @Override
  public List<ResPredefinedMessage> loadAll() {
    return resPredefinedMessageDAO.loadAll();
  }

  @Override
  public List<ResPredefinedMessage> loadByNamedQuery(String queryName) {
    return resPredefinedMessageDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPredefinedMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resPredefinedMessageDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPredefinedMessageDAO.countAll();

  }

  @Override
  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPredefinedMessageDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPredefinedMessage> loadAll(Integer startPage, Integer pageSize) {
    return resPredefinedMessageDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPredefinedMessageDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPredefinedMessageDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPredefinedMessageDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPredefinedMessageDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPredefinedMessageDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
