package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReports;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReportsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResReportsDAOImpl extends AbstractDAO implements ResReportsDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResReports resReports) {
    super.delete(resReports);
  }

  public ResReports saveOrUpdate(ResReports resReports) {
    return (ResReports) super.saveOrUpdate(resReports);
  }

  public ResReports load(Long id) {
    return (ResReports) super.get(ResReports.class, id);
  }


  public List<ResReports> loadAll() {
    return (List<ResReports>) super.loadAll(ResReports.class);
  }


  public List<ResReports> loadByNamedQuery(String queryName) {

    return (List<ResReports>) super.loadByNamedQuery(queryName);
  }


  public List<ResReports> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResReports>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResReports.class);
  }



  public List<ResReports> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResReports.class, startPage, pageSize);
  }



  @Override
  public List<ResReports> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResReports> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResReports>) super.load(ResReports.class, criteria, conjuncationType);
  }

  @Override
  public List<ResReports> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResReports> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResReports> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResReports>) super.load(ResReports.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResReports.class, criteria, conjuncationType);
  }



}
