package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationTimeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResReservationTimeDAOImpl extends AbstractDAO implements ResReservationTimeDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResReservationTime resReservationTime) {
    super.delete(resReservationTime);
  }

  public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime) {
    return (ResReservationTime) super.saveOrUpdate(resReservationTime);
  }

  public ResReservationTime load(Long id) {
    return (ResReservationTime) super.get(ResReservationTime.class, id);
  }


  public List<ResReservationTime> loadAll() {
    return (List<ResReservationTime>) super.loadAll(ResReservationTime.class);
  }


  public List<ResReservationTime> loadByNamedQuery(String queryName) {

    return (List<ResReservationTime>) super.loadByNamedQuery(queryName);
  }


  public List<ResReservationTime> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResReservationTime>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResReservationTime.class);
  }



  public List<ResReservationTime> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResReservationTime.class, startPage, pageSize);
  }



  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResReservationTime>) super.load(ResReservationTime.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationTime> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResReservationTime>) super.load(ResReservationTime.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResReservationTime.class, criteria, conjuncationType);
  }



}
