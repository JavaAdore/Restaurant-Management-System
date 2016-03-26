package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerAddress;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResCustomerAddressService {


  public void delete(ResCustomerAddress resCustomerAddress);

  public ResCustomerAddress saveOrUpdate(ResCustomerAddress resCustomerAddress);

  public ResCustomerAddress load(Long id);


  public List<ResCustomerAddress> loadAll();


  public List<ResCustomerAddress> loadByNamedQuery(String queryName);


  public List<ResCustomerAddress> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResCustomerAddress> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResCustomerAddress> loadAll(Integer startPage, Integer pageSize);

  public List<ResCustomerAddress> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResCustomerAddress> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResCustomerAddress> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCustomerAddress> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResCustomerAddress> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResCustomerAddress> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCustomerAddress> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
