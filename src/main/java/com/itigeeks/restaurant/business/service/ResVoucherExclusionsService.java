package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResVoucherExclusionsService {


  public void delete(ResVoucherExclusions resVoucherExclusions);

  public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions);

  public ResVoucherExclusions load(Long id);


  public List<ResVoucherExclusions> loadAll();


  public List<ResVoucherExclusions> loadByNamedQuery(String queryName);


  public List<ResVoucherExclusions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResVoucherExclusions> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResVoucherExclusions> loadAll(Integer startPage, Integer pageSize);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResVoucherExclusions> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResVoucherExclusions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResVoucherExclusions> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResVoucherExclusions> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResVoucherExclusions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResVoucherExclusions> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
