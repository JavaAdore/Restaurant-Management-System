package com.itigeeks.restaurant.business.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.business.service.ResPromotionalOfferService;
import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionalOfferDAO;

/**
 * Implementation of ResPromotionalOfferService
 */
@Service
public class ResPromotionalOfferServiceImpl implements ResPromotionalOfferService {


  @Autowired
  private ResPromotionalOfferDAO resPromotionalOfferDAO;

  @Override
  public void delete(ResPromotionalOffer resPromotionalOffer) {
    resPromotionalOfferDAO.delete(resPromotionalOffer);
  }



  @Override
  public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer) {
    return resPromotionalOfferDAO.saveOrUpdate(resPromotionalOffer);
  }

  @Override
  public ResPromotionalOffer load(Long id) {
    return resPromotionalOfferDAO.load(id);

  }


  @Override
  public List<ResPromotionalOffer> loadAll() {
    return resPromotionalOfferDAO.loadAll();
  }

  @Override
  public List<ResPromotionalOffer> loadByNamedQuery(String queryName) {
    return resPromotionalOfferDAO.loadByNamedQuery(queryName);

  }

  @Override
  public List<ResPromotionalOffer> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return resPromotionalOfferDAO.loadByNamedQuery(queryName, queryParameters);

  }

  @Override
  public List<ResPromotionalOffer> load(Map<String, Object> criteria) {
    return loadWithAllCriteria(criteria);
  }

  @Override
  public Integer countAll() {
    return resPromotionalOfferDAO.countAll();

  }

  @Override
  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria) {
    return resPromotionalOfferDAO.load(criteria, QueryConjunctionType.AND);

  }


  @Override
  public List<ResPromotionalOffer> loadAll(Integer startPage, Integer pageSize) {
    return resPromotionalOfferDAO.loadAll(startPage, pageSize);
  }



  @Override
  public List<ResPromotionalOffer> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAllCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize) {
    return loadWithAnyCriteria(criteria, startPage, pageSize, null, null);

  }

  @Override
  public List<ResPromotionalOffer> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPromotionalOfferDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.AND);

  }

  @Override
  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending) {
    return resPromotionalOfferDAO.load(criteria, startPage, pageSize, sortField, ascending,
        QueryConjunctionType.OR);

  }



  public List<ResPromotionalOffer> loadWithAnyCriteria(Map<String, Object> criteria) {
    return resPromotionalOfferDAO.load(criteria, QueryConjunctionType.OR);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return getCountOfAllCriteria(criteria);
  }

  @Override
  public Integer getCountOfAllCriteria(Map<String, Object> criteria) {
    return resPromotionalOfferDAO.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria) {
    return resPromotionalOfferDAO.getCount(criteria, QueryConjunctionType.OR);

  }



}
