package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPrintBlockService;
import com.itigeeks.restaurant.common.entity.schema.ResPrintBlock;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockDAO;

/**
 * Implementation of ResPrintBlockService
 */
@Service
public class ResPrintBlockServiceImpl implements ResPrintBlockService {


  @Autowired
  private ResPrintBlockDAO resPrintBlockDAO;

  @Override
  public void delete(ResPrintBlock resPrintBlock) {
    resPrintBlockDAO.delete(resPrintBlock);
  }



  @Override
  public ResPrintBlock saveOrUpdate(ResPrintBlock resPrintBlock) {
    return resPrintBlockDAO.saveOrUpdate(resPrintBlock);
  }

  @Override
  public ResPrintBlock load(Long id) {
    return resPrintBlockDAO.load(id);

  }


  @Override
  public List<ResPrintBlock> loadAll() {
    return resPrintBlockDAO.loadAll();
  }

  @Override
  public List<ResPrintBlock> loadByNamedQuery(String queryName) {
    return resPrintBlockDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPrintBlock> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return resPrintBlockDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPrintBlockDAO.countAll();

  }

  @Override
  public List<ResPrintBlock> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPrintBlockDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPrintBlock> loadAll(Integer startPage, Integer pageSize) {
    return resPrintBlockDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlock> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlock> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPrintBlock> loadWithAllCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPrintBlockDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPrintBlock> loadWithAnyCriteria(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending) {
    return resPrintBlockDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPrintBlock> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPrintBlockDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPrintBlockDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPrintBlockDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
