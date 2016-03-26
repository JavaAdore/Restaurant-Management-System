package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherExclusionsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResVoucherExclusionsDAOImpl extends AbstractDAO implements ResVoucherExclusionsDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResVoucherExclusions resVoucherExclusions) {
    super.delete(resVoucherExclusions);
  }

  public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions) {
    return (ResVoucherExclusions) super.saveOrUpdate(resVoucherExclusions);
  }

  public ResVoucherExclusions load(Long id) {
    return (ResVoucherExclusions) super.get(ResVoucherExclusions.class, id);
  }


  public List<ResVoucherExclusions> loadAll() {
    return (List<ResVoucherExclusions>) super.loadAll(ResVoucherExclusions.class);
  }


  public List<ResVoucherExclusions> loadByNamedQuery(String queryName) {

    return (List<ResVoucherExclusions>) super.loadByNamedQuery(queryName);
  }


  public List<ResVoucherExclusions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResVoucherExclusions>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResVoucherExclusions.class);
  }



  public List<ResVoucherExclusions> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResVoucherExclusions.class, startPage, pageSize);
  }



  @Override
  public List<ResVoucherExclusions> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResVoucherExclusions> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResVoucherExclusions>) super.load(ResVoucherExclusions.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResVoucherExclusions>) super.load(ResVoucherExclusions.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResVoucherExclusions.class, criteria, conjuncationType);
  }



}
