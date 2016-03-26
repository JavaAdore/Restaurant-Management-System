package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderDeleteLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDeleteLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResOrderDeleteLogDAOImpl extends AbstractDAO implements ResOrderDeleteLogDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResOrderDeleteLog resOrderDeleteLog) {
    super.delete(resOrderDeleteLog);
  }

  public ResOrderDeleteLog saveOrUpdate(ResOrderDeleteLog resOrderDeleteLog) {
    return (ResOrderDeleteLog) super.saveOrUpdate(resOrderDeleteLog);
  }

  public ResOrderDeleteLog load(Long id) {
    return (ResOrderDeleteLog) super.get(ResOrderDeleteLog.class, id);
  }


  public List<ResOrderDeleteLog> loadAll() {
    return (List<ResOrderDeleteLog>) super.loadAll(ResOrderDeleteLog.class);
  }


  public List<ResOrderDeleteLog> loadByNamedQuery(String queryName) {

    return (List<ResOrderDeleteLog>) super.loadByNamedQuery(queryName);
  }


  public List<ResOrderDeleteLog> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResOrderDeleteLog>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResOrderDeleteLog.class);
  }



  public List<ResOrderDeleteLog> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResOrderDeleteLog.class, startPage, pageSize);
  }



  @Override
  public List<ResOrderDeleteLog> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResOrderDeleteLog> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResOrderDeleteLog>) super
        .load(ResOrderDeleteLog.class, criteria, conjuncationType);
  }

  @Override
  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderDeleteLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResOrderDeleteLog>) super.load(ResOrderDeleteLog.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResOrderDeleteLog.class, criteria, conjuncationType);
  }



}
