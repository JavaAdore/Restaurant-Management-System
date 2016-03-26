package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResReservationInvoiceService;
import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationInvoiceDAO;

/**
 * Implementation of ResReservationInvoiceService
 */
@Service
public class ResReservationInvoiceServiceImpl implements ResReservationInvoiceService {


  @Autowired
  private ResReservationInvoiceDAO resReservationInvoiceDAO;

  @Override
  public void delete(ResReservationInvoice resReservationInvoice) {
    resReservationInvoiceDAO.delete(resReservationInvoice);
  }



  @Override
  public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice) {
    return resReservationInvoiceDAO.saveOrUpdate(resReservationInvoice);
  }

  @Override
  public ResReservationInvoice load(Long id) {
    return resReservationInvoiceDAO.load(id);

  }


  @Override
  public List<ResReservationInvoice> loadAll() {
    return resReservationInvoiceDAO.loadAll();
  }

  @Override
  public List<ResReservationInvoice> loadByNamedQuery(String queryName) {
    return resReservationInvoiceDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResReservationInvoice> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resReservationInvoiceDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resReservationInvoiceDAO.countAll();

  }

  @Override
  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria) {
    return resReservationInvoiceDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResReservationInvoice> loadAll(Integer startPage, Integer pageSize) {
    return resReservationInvoiceDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResReservationInvoice> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationInvoiceDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resReservationInvoiceDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationInvoiceDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resReservationInvoiceDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resReservationInvoiceDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
