package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResReservationInvoice;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResReservationInvoiceService {


  public void delete(ResReservationInvoice resReservationInvoice);

  public ResReservationInvoice saveOrUpdate(ResReservationInvoice resReservationInvoice);

  public ResReservationInvoice load(Long id);


  public List<ResReservationInvoice> loadAll();


  public List<ResReservationInvoice> loadByNamedQuery(String queryName);


  public List<ResReservationInvoice> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResReservationInvoice> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResReservationInvoice> loadAll(Integer startPage, Integer pageSize);

  public List<ResReservationInvoice> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationInvoice> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResReservationInvoice> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
