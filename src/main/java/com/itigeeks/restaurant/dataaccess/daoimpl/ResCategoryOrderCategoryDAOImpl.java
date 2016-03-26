package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategoryOrderCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCategoryOrderCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCategoryOrderCategoryDAOImpl extends AbstractDAO implements
    ResCategoryOrderCategoryDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCategoryOrderCategory resCategoryOrderCategory) {
    super.delete(resCategoryOrderCategory);
  }

  public ResCategoryOrderCategory saveOrUpdate(ResCategoryOrderCategory resCategoryOrderCategory) {
    return (ResCategoryOrderCategory) super.saveOrUpdate(resCategoryOrderCategory);
  }

  public ResCategoryOrderCategory load(Long id) {
    return (ResCategoryOrderCategory) super.get(ResCategoryOrderCategory.class, id);
  }


  public List<ResCategoryOrderCategory> loadAll() {
    return (List<ResCategoryOrderCategory>) super.loadAll(ResCategoryOrderCategory.class);
  }


  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName) {

    return (List<ResCategoryOrderCategory>) super.loadByNamedQuery(queryName);
  }


  public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResCategoryOrderCategory>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCategoryOrderCategory.class);
  }



  public List<ResCategoryOrderCategory> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCategoryOrderCategory.class, startPage, pageSize);
  }



  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResCategoryOrderCategory>) super.load(ResCategoryOrderCategory.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCategoryOrderCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCategoryOrderCategory>) super.load(ResCategoryOrderCategory.class, criteria,
        startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCategoryOrderCategory.class, criteria, conjuncationType);
  }



}
