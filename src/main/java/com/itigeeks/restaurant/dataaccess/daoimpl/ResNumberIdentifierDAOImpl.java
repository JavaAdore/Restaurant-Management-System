package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResNumberIdentifier;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResNumberIdentifierDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResNumberIdentifierDAOImpl extends AbstractDAO implements ResNumberIdentifierDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResNumberIdentifier resNumberIdentifier) {
    super.delete(resNumberIdentifier);
  }

  public ResNumberIdentifier saveOrUpdate(ResNumberIdentifier resNumberIdentifier) {
    return (ResNumberIdentifier) super.saveOrUpdate(resNumberIdentifier);
  }

  public ResNumberIdentifier load(Long id) {
    return (ResNumberIdentifier) super.get(ResNumberIdentifier.class, id);
  }


  public List<ResNumberIdentifier> loadAll() {
    return (List<ResNumberIdentifier>) super.loadAll(ResNumberIdentifier.class);
  }


  public List<ResNumberIdentifier> loadByNamedQuery(String queryName) {

    return (List<ResNumberIdentifier>) super.loadByNamedQuery(queryName);
  }


  public List<ResNumberIdentifier> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResNumberIdentifier>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResNumberIdentifier.class);
  }



  public List<ResNumberIdentifier> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResNumberIdentifier.class, startPage, pageSize);
  }



  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResNumberIdentifier>) super.load(ResNumberIdentifier.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResNumberIdentifier> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResNumberIdentifier>) super.load(ResNumberIdentifier.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResNumberIdentifier.class, criteria, conjuncationType);
  }



}
