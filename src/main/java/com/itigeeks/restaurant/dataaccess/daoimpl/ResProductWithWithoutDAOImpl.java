package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWithWithout;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWithWithoutDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResProductWithWithoutDAOImpl extends AbstractDAO implements ResProductWithWithoutDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResProductWithWithout resProductWithWithout) {
    super.delete(resProductWithWithout);
  }

  public ResProductWithWithout saveOrUpdate(ResProductWithWithout resProductWithWithout) {
    return (ResProductWithWithout) super.saveOrUpdate(resProductWithWithout);
  }

  public ResProductWithWithout load(Long id) {
    return (ResProductWithWithout) super.get(ResProductWithWithout.class, id);
  }


  public List<ResProductWithWithout> loadAll() {
    return (List<ResProductWithWithout>) super.loadAll(ResProductWithWithout.class);
  }


  public List<ResProductWithWithout> loadByNamedQuery(String queryName) {

    return (List<ResProductWithWithout>) super.loadByNamedQuery(queryName);
  }


  public List<ResProductWithWithout> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResProductWithWithout>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResProductWithWithout.class);
  }



  public List<ResProductWithWithout> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResProductWithWithout.class, startPage, pageSize);
  }



  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResProductWithWithout>) super.load(ResProductWithWithout.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductWithWithout> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResProductWithWithout>) super.load(ResProductWithWithout.class, criteria,
        startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResProductWithWithout.class, criteria, conjuncationType);
  }



}
