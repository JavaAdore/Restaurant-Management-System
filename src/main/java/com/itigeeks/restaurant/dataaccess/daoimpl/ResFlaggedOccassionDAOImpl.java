package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFlaggedOccassionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResFlaggedOccassionDAOImpl extends AbstractDAO implements ResFlaggedOccassionDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResFlaggedOccassion resFlaggedOccassion) {
    super.delete(resFlaggedOccassion);
  }

  public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion) {
    return (ResFlaggedOccassion) super.saveOrUpdate(resFlaggedOccassion);
  }

  public ResFlaggedOccassion load(Long id) {
    return (ResFlaggedOccassion) super.get(ResFlaggedOccassion.class, id);
  }


  public List<ResFlaggedOccassion> loadAll() {
    return (List<ResFlaggedOccassion>) super.loadAll(ResFlaggedOccassion.class);
  }


  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName) {

    return (List<ResFlaggedOccassion>) super.loadByNamedQuery(queryName);
  }


  public List<ResFlaggedOccassion> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResFlaggedOccassion>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResFlaggedOccassion.class);
  }



  public List<ResFlaggedOccassion> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResFlaggedOccassion.class, startPage, pageSize);
  }



  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResFlaggedOccassion>) super.load(ResFlaggedOccassion.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResFlaggedOccassion> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResFlaggedOccassion>) super.load(ResFlaggedOccassion.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResFlaggedOccassion.class, criteria, conjuncationType);
  }



}
