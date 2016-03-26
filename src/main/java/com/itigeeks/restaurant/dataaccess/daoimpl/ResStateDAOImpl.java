package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResState;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResStateDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResStateDAOImpl extends AbstractDAO implements ResStateDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResState resState) {
    super.delete(resState);
  }

  public ResState saveOrUpdate(ResState resState) {
    return (ResState) super.saveOrUpdate(resState);
  }

  public ResState load(Long id) {
    return (ResState) super.get(ResState.class, id);
  }


  public List<ResState> loadAll() {
    return (List<ResState>) super.loadAll(ResState.class);
  }


  public List<ResState> loadByNamedQuery(String queryName) {

    return (List<ResState>) super.loadByNamedQuery(queryName);
  }


  public List<ResState> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResState>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResState.class);
  }



  public List<ResState> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResState.class, startPage, pageSize);
  }



  @Override
  public List<ResState> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResState> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResState>) super.load(ResState.class, criteria, conjuncationType);
  }

  @Override
  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResState> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResState>) super.load(ResState.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResState.class, criteria, conjuncationType);
  }



}
