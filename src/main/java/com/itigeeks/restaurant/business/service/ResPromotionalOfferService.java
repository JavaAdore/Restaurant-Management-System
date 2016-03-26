package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResPromotionalOfferService {


  public void delete(ResPromotionalOffer resPromotionalOffer);

  public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer);

  public ResPromotionalOffer load(Long id);


  public List<ResPromotionalOffer> loadAll();


  public List<ResPromotionalOffer> loadByNamedQuery(String queryName);


  public List<ResPromotionalOffer> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResPromotionalOffer> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResPromotionalOffer> loadAll(Integer startPage, Integer pageSize);

  public List<ResPromotionalOffer> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
