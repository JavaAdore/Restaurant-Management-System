package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFloor;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFloorDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResFloorDAOImpl extends AbstractDAO implements ResFloorDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResFloor resFloor) {
    super.delete(resFloor);
  }

  public ResFloor saveOrUpdate(ResFloor resFloor) {
    return (ResFloor) super.saveOrUpdate(resFloor);
  }

  public ResFloor load(Long id) {
    return (ResFloor) super.get(ResFloor.class, id);
  }


  public List<ResFloor> loadAll() {
    return (List<ResFloor>) super.loadAll(ResFloor.class);
  }


  public List<ResFloor> loadByNamedQuery(String queryName) {

    return (List<ResFloor>) super.loadByNamedQuery(queryName);
  }


  public List<ResFloor> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResFloor>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResFloor.class);
  }



  public List<ResFloor> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResFloor.class, startPage, pageSize);
  }



  @Override
  public List<ResFloor> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResFloor> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResFloor>) super.load(ResFloor.class, criteria, conjuncationType);
  }

  @Override
  public List<ResFloor> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResFloor> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResFloor> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResFloor>) super.load(ResFloor.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResFloor.class, criteria, conjuncationType);
  }



}
