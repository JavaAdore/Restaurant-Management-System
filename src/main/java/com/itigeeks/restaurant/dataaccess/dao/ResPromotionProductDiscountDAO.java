package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Repository
public interface ResPromotionProductDiscountDAO {


  public void delete(ResPromotionProductDiscount resPromotionProductDiscount);

  public ResPromotionProductDiscount saveOrUpdate(
      ResPromotionProductDiscount resPromotionProductDiscount);

  public ResPromotionProductDiscount load(Long id);

  public List<ResPromotionProductDiscount> loadAll();

  public List<ResPromotionProductDiscount> loadAll(Integer startPage, Integer pageSize);

  public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName);

  public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);

  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria);

  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria,
      QueryConjunctionType queryConjunctionType);

  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer firstPage,
      Integer pageSize);

  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType);

  public List<ResPromotionProductDiscount> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType);


  public Integer countAll();

  public Integer getCount(Map<String, Object> criteria);

  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType);



}
