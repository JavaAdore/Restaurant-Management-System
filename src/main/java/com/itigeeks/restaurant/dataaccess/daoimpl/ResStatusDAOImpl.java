package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResStatusDAOImpl extends AbstractDAO implements ResStatusDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResStatus resStatus) {
    super.delete(resStatus);
  }

  public ResStatus saveOrUpdate(ResStatus resStatus) {
    return (ResStatus) super.saveOrUpdate(resStatus);
  }

  public ResStatus load(Long id) {
    return (ResStatus) super.get(ResStatus.class, id);
  }


  public List<ResStatus> loadAll() {
    return (List<ResStatus>) super.loadAll(ResStatus.class);
  }


  public List<ResStatus> loadByNamedQuery(String queryName) {

    return (List<ResStatus>) super.loadByNamedQuery(queryName);
  }


  public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResStatus>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResStatus.class);
  }



  public List<ResStatus> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResStatus.class, startPage, pageSize);
  }



  @Override
  public List<ResStatus> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResStatus> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResStatus>) super.load(ResStatus.class, criteria, conjuncationType);
  }

  @Override
  public List<ResStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResStatus>) super.load(ResStatus.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResStatus.class, criteria, conjuncationType);
  }



}
