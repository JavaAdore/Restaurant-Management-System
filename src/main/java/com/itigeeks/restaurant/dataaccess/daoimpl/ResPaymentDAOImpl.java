package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPayment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPaymentDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPaymentDAOImpl extends AbstractDAO implements ResPaymentDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPayment resPayment) {
    super.delete(resPayment);
  }

  public ResPayment saveOrUpdate(ResPayment resPayment) {
    return (ResPayment) super.saveOrUpdate(resPayment);
  }

  public ResPayment load(Long id) {
    return (ResPayment) super.get(ResPayment.class, id);
  }


  public List<ResPayment> loadAll() {
    return (List<ResPayment>) super.loadAll(ResPayment.class);
  }


  public List<ResPayment> loadByNamedQuery(String queryName) {

    return (List<ResPayment>) super.loadByNamedQuery(queryName);
  }


  public List<ResPayment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResPayment>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPayment.class);
  }



  public List<ResPayment> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPayment.class, startPage, pageSize);
  }



  @Override
  public List<ResPayment> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPayment> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResPayment>) super.load(ResPayment.class, criteria, conjuncationType);
  }

  @Override
  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPayment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPayment>) super.load(ResPayment.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPayment.class, criteria, conjuncationType);
  }



}
