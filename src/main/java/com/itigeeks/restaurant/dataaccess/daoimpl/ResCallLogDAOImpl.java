package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCallLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCallLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCallLogDAOImpl extends AbstractDAO implements ResCallLogDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCallLog resCallLog) {
    super.delete(resCallLog);
  }

  public ResCallLog saveOrUpdate(ResCallLog resCallLog) {
    return (ResCallLog) super.saveOrUpdate(resCallLog);
  }

  public ResCallLog load(Long id) {
    return (ResCallLog) super.get(ResCallLog.class, id);
  }


  public List<ResCallLog> loadAll() {
    return (List<ResCallLog>) super.loadAll(ResCallLog.class);
  }


  public List<ResCallLog> loadByNamedQuery(String queryName) {

    return (List<ResCallLog>) super.loadByNamedQuery(queryName);
  }


  public List<ResCallLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResCallLog>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCallLog.class);
  }



  public List<ResCallLog> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCallLog.class, startPage, pageSize);
  }



  @Override
  public List<ResCallLog> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCallLog> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResCallLog>) super.load(ResCallLog.class, criteria, conjuncationType);
  }

  @Override
  public List<ResCallLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCallLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCallLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCallLog>) super.load(ResCallLog.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCallLog.class, criteria, conjuncationType);
  }



}
