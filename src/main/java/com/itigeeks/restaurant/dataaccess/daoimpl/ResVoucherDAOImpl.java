package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResVoucherDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResVoucherDAOImpl extends AbstractDAO implements ResVoucherDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResVoucher resVoucher) {
    super.delete(resVoucher);
  }

  public ResVoucher saveOrUpdate(ResVoucher resVoucher) {
    return (ResVoucher) super.saveOrUpdate(resVoucher);
  }

  public ResVoucher load(Long id) {
    return (ResVoucher) super.get(ResVoucher.class, id);
  }


  public List<ResVoucher> loadAll() {
    return (List<ResVoucher>) super.loadAll(ResVoucher.class);
  }


  public List<ResVoucher> loadByNamedQuery(String queryName) {

    return (List<ResVoucher>) super.loadByNamedQuery(queryName);
  }


  public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResVoucher>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResVoucher.class);
  }



  public List<ResVoucher> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResVoucher.class, startPage, pageSize);
  }



  @Override
  public List<ResVoucher> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResVoucher> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResVoucher>) super.load(ResVoucher.class, criteria, conjuncationType);
  }

  @Override
  public List<ResVoucher> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResVoucher> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResVoucher> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResVoucher>) super.load(ResVoucher.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResVoucher.class, criteria, conjuncationType);
  }



}
