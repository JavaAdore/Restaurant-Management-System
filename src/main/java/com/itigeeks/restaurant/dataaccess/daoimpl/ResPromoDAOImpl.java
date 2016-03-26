package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromo;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromoDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPromoDAOImpl extends AbstractDAO implements ResPromoDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPromo resPromo) {
    super.delete(resPromo);
  }

  public ResPromo saveOrUpdate(ResPromo resPromo) {
    return (ResPromo) super.saveOrUpdate(resPromo);
  }

  public ResPromo load(Long id) {
    return (ResPromo) super.get(ResPromo.class, id);
  }


  public List<ResPromo> loadAll() {
    return (List<ResPromo>) super.loadAll(ResPromo.class);
  }


  public List<ResPromo> loadByNamedQuery(String queryName) {

    return (List<ResPromo>) super.loadByNamedQuery(queryName);
  }


  public List<ResPromo> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResPromo>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPromo.class);
  }



  public List<ResPromo> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPromo.class, startPage, pageSize);
  }



  @Override
  public List<ResPromo> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPromo> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResPromo>) super.load(ResPromo.class, criteria, conjuncationType);
  }

  @Override
  public List<ResPromo> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPromo> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPromo> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPromo>) super.load(ResPromo.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPromo.class, criteria, conjuncationType);
  }



}
