package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDiscountDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPromotionProductDiscountDAOImpl extends AbstractDAO implements
    ResPromotionProductDiscountDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPromotionProductDiscount resPromotionProductDiscount) {
    super.delete(resPromotionProductDiscount);
  }

  public ResPromotionProductDiscount saveOrUpdate(
      ResPromotionProductDiscount resPromotionProductDiscount) {
    return (ResPromotionProductDiscount) super.saveOrUpdate(resPromotionProductDiscount);
  }

  public ResPromotionProductDiscount load(Long id) {
    return (ResPromotionProductDiscount) super.get(ResPromotionProductDiscount.class, id);
  }


  public List<ResPromotionProductDiscount> loadAll() {
    return (List<ResPromotionProductDiscount>) super.loadAll(ResPromotionProductDiscount.class);
  }


  public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName) {

    return (List<ResPromotionProductDiscount>) super.loadByNamedQuery(queryName);
  }


  public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResPromotionProductDiscount>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPromotionProductDiscount.class);
  }



  public List<ResPromotionProductDiscount> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPromotionProductDiscount.class, startPage, pageSize);
  }



  @Override
  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResPromotionProductDiscount>) super.load(ResPromotionProductDiscount.class,
        criteria, conjuncationType);
  }

  @Override
  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPromotionProductDiscount>) super.load(ResPromotionProductDiscount.class,
        criteria, startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPromotionProductDiscount.class, criteria, conjuncationType);
  }



}
