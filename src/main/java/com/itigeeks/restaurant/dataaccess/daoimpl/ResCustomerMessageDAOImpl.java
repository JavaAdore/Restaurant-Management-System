package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCustomerMessageDAOImpl extends AbstractDAO implements ResCustomerMessageDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCustomerMessage resCustomerMessage) {
    super.delete(resCustomerMessage);
  }

  public ResCustomerMessage saveOrUpdate(ResCustomerMessage resCustomerMessage) {
    return (ResCustomerMessage) super.saveOrUpdate(resCustomerMessage);
  }

  public ResCustomerMessage load(Long id) {
    return (ResCustomerMessage) super.get(ResCustomerMessage.class, id);
  }


  public List<ResCustomerMessage> loadAll() {
    return (List<ResCustomerMessage>) super.loadAll(ResCustomerMessage.class);
  }


  public List<ResCustomerMessage> loadByNamedQuery(String queryName) {

    return (List<ResCustomerMessage>) super.loadByNamedQuery(queryName);
  }


  public List<ResCustomerMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResCustomerMessage>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCustomerMessage.class);
  }



  public List<ResCustomerMessage> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCustomerMessage.class, startPage, pageSize);
  }



  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResCustomerMessage>) super.load(ResCustomerMessage.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCustomerMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCustomerMessage>) super.load(ResCustomerMessage.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCustomerMessage.class, criteria, conjuncationType);
  }



}
