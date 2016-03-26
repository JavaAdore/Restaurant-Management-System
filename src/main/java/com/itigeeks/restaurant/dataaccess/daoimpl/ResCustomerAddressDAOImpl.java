package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerAddressDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCustomerAddressDAOImpl extends AbstractDAO implements ResCustomerAddressDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCustomerAddress resCustomerAddress) {
    super.delete(resCustomerAddress);
  }

  public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress) {
    return (ResCustomerAddress) super.saveOrUpdate(resCustomerAddress);
  }

  public ResCustomerAddress load(Long id) {
    return (ResCustomerAddress) super.get(ResCustomerAddress.class, id);
  }


  public List<ResCustomerAddress> loadAll() {
    return (List<ResCustomerAddress>) super.loadAll(ResCustomerAddress.class);
  }


  public List<ResCustomerAddress> loadByNamedQuery(String queryName) {

    return (List<ResCustomerAddress>) super.loadByNamedQuery(queryName);
  }


  public List<ResCustomerAddress> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResCustomerAddress>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCustomerAddress.class);
  }



  public List<ResCustomerAddress> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCustomerAddress.class, startPage, pageSize);
  }



  @Override
  public List<ResCustomerAddress> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCustomerAddress> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResCustomerAddress>) super.load(ResCustomerAddress.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCustomerAddress>) super.load(ResCustomerAddress.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCustomerAddress.class, criteria, conjuncationType);
  }



}
