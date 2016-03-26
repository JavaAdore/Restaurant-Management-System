package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTable;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResTableDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResTableDAOImpl extends AbstractDAO implements ResTableDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResTable resTable) {
    super.delete(resTable);
  }

  public ResTable saveOrUpdate(ResTable resTable) {
    return (ResTable) super.saveOrUpdate(resTable);
  }

  public ResTable load(Long id) {
    return (ResTable) super.get(ResTable.class, id);
  }


  public List<ResTable> loadAll() {
    return (List<ResTable>) super.loadAll(ResTable.class);
  }


  public List<ResTable> loadByNamedQuery(String queryName) {

    return (List<ResTable>) super.loadByNamedQuery(queryName);
  }


  public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResTable>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResTable.class);
  }



  public List<ResTable> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResTable.class, startPage, pageSize);
  }



  @Override
  public List<ResTable> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResTable> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResTable>) super.load(ResTable.class, criteria, conjuncationType);
  }

  @Override
  public List<ResTable> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResTable> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResTable> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResTable>) super.load(ResTable.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResTable.class, criteria, conjuncationType);
  }



}
