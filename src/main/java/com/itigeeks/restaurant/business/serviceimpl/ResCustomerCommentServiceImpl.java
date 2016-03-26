package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResCustomerCommentService;
import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerCommentDAO;

/**
 * Implementation of ResCustomerCommentService
 */
@Service
public class ResCustomerCommentServiceImpl implements ResCustomerCommentService {


  @Autowired
  private ResCustomerCommentDAO resCustomerCommentDAO;

  @Override
  public void delete(ResCustomerComment resCustomerComment) {
    resCustomerCommentDAO.delete(resCustomerComment);
  }



  @Override
  public ResCustomerComment saveOrUpdate(ResCustomerComment resCustomerComment) {
    return resCustomerCommentDAO.saveOrUpdate(resCustomerComment);
  }

  @Override
  public ResCustomerComment load(Long id) {
    return resCustomerCommentDAO.load(id);

  }


  @Override
  public List<ResCustomerComment> loadAll() {
    return resCustomerCommentDAO.loadAll();
  }

  @Override
  public List<ResCustomerComment> loadByNamedQuery(String queryName) {
    return resCustomerCommentDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResCustomerComment> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resCustomerCommentDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResCustomerComment> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resCustomerCommentDAO.countAll();

  }

  @Override
  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria) {
    return resCustomerCommentDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResCustomerComment> loadAll(Integer startPage, Integer pageSize) {
    return resCustomerCommentDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResCustomerComment> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCustomerCommentDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resCustomerCommentDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resCustomerCommentDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resCustomerCommentDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resCustomerCommentDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
