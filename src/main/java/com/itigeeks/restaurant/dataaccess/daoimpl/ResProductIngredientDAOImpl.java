package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductIngredient;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductIngredientDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResProductIngredientDAOImpl extends AbstractDAO implements ResProductIngredientDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResProductIngredient resProductIngredient) {
    super.delete(resProductIngredient);
  }

  public ResProductIngredient saveOrUpdate(ResProductIngredient resProductIngredient) {
    return (ResProductIngredient) super.saveOrUpdate(resProductIngredient);
  }

  public ResProductIngredient load(Long id) {
    return (ResProductIngredient) super.get(ResProductIngredient.class, id);
  }


  public List<ResProductIngredient> loadAll() {
    return (List<ResProductIngredient>) super.loadAll(ResProductIngredient.class);
  }


  public List<ResProductIngredient> loadByNamedQuery(String queryName) {

    return (List<ResProductIngredient>) super.loadByNamedQuery(queryName);
  }


  public List<ResProductIngredient> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResProductIngredient>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResProductIngredient.class);
  }



  public List<ResProductIngredient> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResProductIngredient.class, startPage, pageSize);
  }



  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResProductIngredient>) super.load(ResProductIngredient.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductIngredient> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResProductIngredient>) super.load(ResProductIngredient.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResProductIngredient.class, criteria, conjuncationType);
  }



}
