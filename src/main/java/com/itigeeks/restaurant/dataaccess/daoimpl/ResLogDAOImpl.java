package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResLogDAOImpl extends AbstractDAO implements ResLogDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResLog resLog) {
    super.delete(resLog);
  }

  public ResLog saveOrUpdate(ResLog resLog) {
    return (ResLog) super.saveOrUpdate(resLog);
  }

  public ResLog load(Long id) {
    return (ResLog) super.get(ResLog.class, id);
  }


  public List<ResLog> loadAll() {
    return (List<ResLog>) super.loadAll(ResLog.class);
  }


  public List<ResLog> loadByNamedQuery(String queryName) {

    return (List<ResLog>) super.loadByNamedQuery(queryName);
  }


  public List<ResLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResLog>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResLog.class);
  }



  public List<ResLog> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResLog.class, startPage, pageSize);
  }



  @Override
  public List<ResLog> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResLog> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResLog>) super.load(ResLog.class, criteria, conjuncationType);
  }

  @Override
  public List<ResLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResLog>) super.load(ResLog.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResLog.class, criteria, conjuncationType);
  }



}
