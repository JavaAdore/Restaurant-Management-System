package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResZreportLog;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResZreportLogDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResZreportLogDAOImpl extends AbstractDAO implements ResZreportLogDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResZreportLog resZreportLog) {
    super.delete(resZreportLog);
  }

  public ResZreportLog saveOrUpdate(ResZreportLog resZreportLog) {
    return (ResZreportLog) super.saveOrUpdate(resZreportLog);
  }

  public ResZreportLog load(Long id) {
    return (ResZreportLog) super.get(ResZreportLog.class, id);
  }


  public List<ResZreportLog> loadAll() {
    return (List<ResZreportLog>) super.loadAll(ResZreportLog.class);
  }


  public List<ResZreportLog> loadByNamedQuery(String queryName) {

    return (List<ResZreportLog>) super.loadByNamedQuery(queryName);
  }


  public List<ResZreportLog> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResZreportLog>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResZreportLog.class);
  }



  public List<ResZreportLog> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResZreportLog.class, startPage, pageSize);
  }



  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResZreportLog>) super.load(ResZreportLog.class, criteria, conjuncationType);
  }

  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResZreportLog> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResZreportLog>) super.load(ResZreportLog.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResZreportLog.class, criteria, conjuncationType);
  }



}
