package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductWasteHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductWasteHistoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResProductWasteHistoryDAOImpl extends AbstractDAO implements
    ResProductWasteHistoryDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResProductWasteHistory resProductWasteHistory) {
    super.delete(resProductWasteHistory);
  }

  public ResProductWasteHistory saveOrUpdate(ResProductWasteHistory resProductWasteHistory) {
    return (ResProductWasteHistory) super.saveOrUpdate(resProductWasteHistory);
  }

  public ResProductWasteHistory load(Long id) {
    return (ResProductWasteHistory) super.get(ResProductWasteHistory.class, id);
  }


  public List<ResProductWasteHistory> loadAll() {
    return (List<ResProductWasteHistory>) super.loadAll(ResProductWasteHistory.class);
  }


  public List<ResProductWasteHistory> loadByNamedQuery(String queryName) {

    return (List<ResProductWasteHistory>) super.loadByNamedQuery(queryName);
  }


  public List<ResProductWasteHistory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResProductWasteHistory>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResProductWasteHistory.class);
  }



  public List<ResProductWasteHistory> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResProductWasteHistory.class, startPage, pageSize);
  }



  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResProductWasteHistory>) super.load(ResProductWasteHistory.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductWasteHistory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResProductWasteHistory>) super.load(ResProductWasteHistory.class, criteria,
        startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResProductWasteHistory.class, criteria, conjuncationType);
  }



}
