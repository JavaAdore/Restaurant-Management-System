package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResOrderCategoryDAOImpl extends AbstractDAO implements ResOrderCategoryDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResOrderCategory resOrderCategory) {
    super.delete(resOrderCategory);
  }

  public ResOrderCategory saveOrUpdate(ResOrderCategory resOrderCategory) {
    return (ResOrderCategory) super.saveOrUpdate(resOrderCategory);
  }

  public ResOrderCategory load(Long id) {
    return (ResOrderCategory) super.get(ResOrderCategory.class, id);
  }


  public List<ResOrderCategory> loadAll() {
    return (List<ResOrderCategory>) super.loadAll(ResOrderCategory.class);
  }


  public List<ResOrderCategory> loadByNamedQuery(String queryName) {

    return (List<ResOrderCategory>) super.loadByNamedQuery(queryName);
  }


  public List<ResOrderCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResOrderCategory>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResOrderCategory.class);
  }



  public List<ResOrderCategory> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResOrderCategory.class, startPage, pageSize);
  }



  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResOrderCategory>) super.load(ResOrderCategory.class, criteria, conjuncationType);
  }

  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResOrderCategory>) super.load(ResOrderCategory.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResOrderCategory.class, criteria, conjuncationType);
  }



}
