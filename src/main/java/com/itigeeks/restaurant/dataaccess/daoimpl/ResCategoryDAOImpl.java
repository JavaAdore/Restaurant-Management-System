package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCategoryDAOImpl extends AbstractDAO implements ResCategoryDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCategory resCategory) {
    super.delete(resCategory);
  }

  public ResCategory saveOrUpdate(ResCategory resCategory) {
    return (ResCategory) super.saveOrUpdate(resCategory);
  }

  public ResCategory load(Long id) {
    return (ResCategory) super.get(ResCategory.class, id);
  }


  public List<ResCategory> loadAll() {
    return (List<ResCategory>) super.loadAll(ResCategory.class);
  }


  public List<ResCategory> loadByNamedQuery(String queryName) {

    return (List<ResCategory>) super.loadByNamedQuery(queryName);
  }


  public List<ResCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResCategory>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCategory.class);
  }



  public List<ResCategory> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCategory.class, startPage, pageSize);
  }



  @Override
  public List<ResCategory> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCategory> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResCategory>) super.load(ResCategory.class, criteria, conjuncationType);
  }

  @Override
  public List<ResCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCategory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCategory>) super.load(ResCategory.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCategory.class, criteria, conjuncationType);
  }



}
