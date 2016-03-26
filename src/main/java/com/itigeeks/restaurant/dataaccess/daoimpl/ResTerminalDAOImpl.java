package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTerminal;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTerminalDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResTerminalDAOImpl extends AbstractDAO implements ResTerminalDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResTerminal resTerminal) {
    super.delete(resTerminal);
  }

  public ResTerminal saveOrUpdate(ResTerminal resTerminal) {
    return (ResTerminal) super.saveOrUpdate(resTerminal);
  }

  public ResTerminal load(Long id) {
    return (ResTerminal) super.get(ResTerminal.class, id);
  }


  public List<ResTerminal> loadAll() {
    return (List<ResTerminal>) super.loadAll(ResTerminal.class);
  }


  public List<ResTerminal> loadByNamedQuery(String queryName) {

    return (List<ResTerminal>) super.loadByNamedQuery(queryName);
  }


  public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResTerminal>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResTerminal.class);
  }



  public List<ResTerminal> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResTerminal.class, startPage, pageSize);
  }



  @Override
  public List<ResTerminal> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResTerminal> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResTerminal>) super.load(ResTerminal.class, criteria, conjuncationType);
  }

  @Override
  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResTerminal> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResTerminal>) super.load(ResTerminal.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResTerminal.class, criteria, conjuncationType);
  }



}
