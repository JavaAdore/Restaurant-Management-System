package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderReplica;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderReplicaDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResOrderReplicaDAOImpl extends AbstractDAO implements ResOrderReplicaDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResOrderReplica resOrderReplica) {
    super.delete(resOrderReplica);
  }

  public ResOrderReplica saveOrUpdate(ResOrderReplica resOrderReplica) {
    return (ResOrderReplica) super.saveOrUpdate(resOrderReplica);
  }

  public ResOrderReplica load(Long id) {
    return (ResOrderReplica) super.get(ResOrderReplica.class, id);
  }


  public List<ResOrderReplica> loadAll() {
    return (List<ResOrderReplica>) super.loadAll(ResOrderReplica.class);
  }


  public List<ResOrderReplica> loadByNamedQuery(String queryName) {

    return (List<ResOrderReplica>) super.loadByNamedQuery(queryName);
  }


  public List<ResOrderReplica> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResOrderReplica>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResOrderReplica.class);
  }



  public List<ResOrderReplica> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResOrderReplica.class, startPage, pageSize);
  }



  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResOrderReplica>) super.load(ResOrderReplica.class, criteria, conjuncationType);
  }

  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderReplica> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResOrderReplica>) super.load(ResOrderReplica.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResOrderReplica.class, criteria, conjuncationType);
  }



}
