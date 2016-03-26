package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationInvoiceDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResReservationInvoiceDAOImpl extends AbstractDAO implements ResReservationInvoiceDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResReservationInvoice resReservationInvoice) {
    super.delete(resReservationInvoice);
  }

  public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice) {
    return (ResReservationInvoice) super.saveOrUpdate(resReservationInvoice);
  }

  public ResReservationInvoice load(Long id) {
    return (ResReservationInvoice) super.get(ResReservationInvoice.class, id);
  }


  public List<ResReservationInvoice> loadAll() {
    return (List<ResReservationInvoice>) super.loadAll(ResReservationInvoice.class);
  }


  public List<ResReservationInvoice> loadByNamedQuery(String queryName) {

    return (List<ResReservationInvoice>) super.loadByNamedQuery(queryName);
  }


  public List<ResReservationInvoice> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResReservationInvoice>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResReservationInvoice.class);
  }



  public List<ResReservationInvoice> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResReservationInvoice.class, startPage, pageSize);
  }



  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResReservationInvoice>) super.load(ResReservationInvoice.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResReservationInvoice>) super.load(ResReservationInvoice.class, criteria,
        startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResReservationInvoice.class, criteria, conjuncationType);
  }



}
