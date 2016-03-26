package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResVoucherExclusionsDAO {


  public void delete(ResVoucherExclusions resVoucherExclusions);

  public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions);

  public ResVoucherExclusions load(Long id);

  public List<ResVoucherExclusions> loadAll();

  public List<ResVoucherExclusions> loadAll(Integer startPage, Integer pageSize);

  public List<ResVoucherExclusions> loadByNamedQuery(String queryName);

  public List<ResVoucherExclusions> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResVoucherExclusions> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
