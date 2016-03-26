package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTableTransactions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTableTransactionsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResTableTransactionsDAOImpl extends AbstractDAO implements ResTableTransactionsDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResTableTransactions resTableTransactions) {
    super.delete(resTableTransactions);
  }

  public ResTableTransactions saveOrUpdate(ResTableTransactions resTableTransactions) {
    return (ResTableTransactions) super.saveOrUpdate(resTableTransactions);
  }

  public ResTableTransactions load(Long id) {
    return (ResTableTransactions) super.get(ResTableTransactions.class, id);
  }


  public List<ResTableTransactions> loadAll() {
    return (List<ResTableTransactions>) super.loadAll(ResTableTransactions.class);
  }


  public List<ResTableTransactions> loadByNamedQuery(String queryName) {

    return (List<ResTableTransactions>) super.loadByNamedQuery(queryName);
  }


  public List<ResTableTransactions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResTableTransactions>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResTableTransactions.class);
  }



  public List<ResTableTransactions> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResTableTransactions.class, startPage, pageSize);
  }



  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResTableTransactions>) super.load(ResTableTransactions.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResTableTransactions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResTableTransactions>) super.load(ResTableTransactions.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResTableTransactions.class, criteria, conjuncationType);
  }



}
