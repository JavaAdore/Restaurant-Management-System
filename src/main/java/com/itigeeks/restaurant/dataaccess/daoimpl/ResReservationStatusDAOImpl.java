package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResReservationStatusDAOImpl extends AbstractDAO implements ResReservationStatusDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResReservationStatus resReservationStatus) {
    super.delete(resReservationStatus);
  }

  public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus) {
    return (ResReservationStatus) super.saveOrUpdate(resReservationStatus);
  }

  public ResReservationStatus load(Long id) {
    return (ResReservationStatus) super.get(ResReservationStatus.class, id);
  }


  public List<ResReservationStatus> loadAll() {
    return (List<ResReservationStatus>) super.loadAll(ResReservationStatus.class);
  }


  public List<ResReservationStatus> loadByNamedQuery(String queryName) {

    return (List<ResReservationStatus>) super.loadByNamedQuery(queryName);
  }


  public List<ResReservationStatus> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResReservationStatus>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResReservationStatus.class);
  }



  public List<ResReservationStatus> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResReservationStatus.class, startPage, pageSize);
  }



  @Override
  public List<ResReservationStatus> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResReservationStatus> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResReservationStatus>) super.load(ResReservationStatus.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationStatus> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResReservationStatus>) super.load(ResReservationStatus.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResReservationStatus.class, criteria, conjuncationType);
  }



}
