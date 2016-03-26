package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMac;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMacDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResMacDAOImpl extends AbstractDAO implements ResMacDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResMac resMac) {
    super.delete(resMac);
  }

  public ResMac saveOrUpdate(ResMac resMac) {
    return (ResMac) super.saveOrUpdate(resMac);
  }

  public ResMac load(Long id) {
    return (ResMac) super.get(ResMac.class, id);
  }


  public List<ResMac> loadAll() {
    return (List<ResMac>) super.loadAll(ResMac.class);
  }


  public List<ResMac> loadByNamedQuery(String queryName) {

    return (List<ResMac>) super.loadByNamedQuery(queryName);
  }


  public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResMac>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResMac.class);
  }



  public List<ResMac> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResMac.class, startPage, pageSize);
  }



  @Override
  public List<ResMac> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResMac> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResMac>) super.load(ResMac.class, criteria, conjuncationType);
  }

  @Override
  public List<ResMac> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResMac> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResMac> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResMac>) super.load(ResMac.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResMac.class, criteria, conjuncationType);
  }



}
