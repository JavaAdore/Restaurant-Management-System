package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResOrderTypeDAOImpl extends AbstractDAO implements ResOrderTypeDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResOrderType resOrderType) {
    super.delete(resOrderType);
  }

  public ResOrderType saveOrUpdate(ResOrderType resOrderType) {
    return (ResOrderType) super.saveOrUpdate(resOrderType);
  }

  public ResOrderType load(Long id) {
    return (ResOrderType) super.get(ResOrderType.class, id);
  }


  public List<ResOrderType> loadAll() {
    return (List<ResOrderType>) super.loadAll(ResOrderType.class);
  }


  public List<ResOrderType> loadByNamedQuery(String queryName) {

    return (List<ResOrderType>) super.loadByNamedQuery(queryName);
  }


  public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResOrderType>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResOrderType.class);
  }



  public List<ResOrderType> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResOrderType.class, startPage, pageSize);
  }



  @Override
  public List<ResOrderType> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResOrderType> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResOrderType>) super.load(ResOrderType.class, criteria, conjuncationType);
  }

  @Override
  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResOrderType>) super.load(ResOrderType.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResOrderType.class, criteria, conjuncationType);
  }



}
