package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProduct;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResProductDAOImpl extends AbstractDAO implements ResProductDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResProduct resProduct) {
    super.delete(resProduct);
  }

  public ResProduct saveOrUpdate(ResProduct resProduct) {
    return (ResProduct) super.saveOrUpdate(resProduct);
  }

  public ResProduct load(Long id) {
    return (ResProduct) super.get(ResProduct.class, id);
  }


  public List<ResProduct> loadAll() {
    return (List<ResProduct>) super.loadAll(ResProduct.class);
  }


  public List<ResProduct> loadByNamedQuery(String queryName) {

    return (List<ResProduct>) super.loadByNamedQuery(queryName);
  }


  public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResProduct>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResProduct.class);
  }



  public List<ResProduct> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResProduct.class, startPage, pageSize);
  }



  @Override
  public List<ResProduct> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResProduct> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResProduct>) super.load(ResProduct.class, criteria, conjuncationType);
  }

  @Override
  public List<ResProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResProduct> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResProduct>) super.load(ResProduct.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResProduct.class, criteria, conjuncationType);
  }



}
