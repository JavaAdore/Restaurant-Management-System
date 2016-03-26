package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResMessageDAOImpl extends AbstractDAO implements ResMessageDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResMessage resMessage) {
    super.delete(resMessage);
  }

  public ResMessage saveOrUpdate(ResMessage resMessage) {
    return (ResMessage) super.saveOrUpdate(resMessage);
  }

  public ResMessage load(Long id) {
    return (ResMessage) super.get(ResMessage.class, id);
  }


  public List<ResMessage> loadAll() {
    return (List<ResMessage>) super.loadAll(ResMessage.class);
  }


  public List<ResMessage> loadByNamedQuery(String queryName) {

    return (List<ResMessage>) super.loadByNamedQuery(queryName);
  }


  public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResMessage>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResMessage.class);
  }



  public List<ResMessage> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResMessage.class, startPage, pageSize);
  }



  @Override
  public List<ResMessage> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResMessage> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResMessage>) super.load(ResMessage.class, criteria, conjuncationType);
  }

  @Override
  public List<ResMessage> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResMessage> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResMessage> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResMessage>) super.load(ResMessage.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResMessage.class, criteria, conjuncationType);
  }



}
