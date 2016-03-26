package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResPredefinedMessageService {


  public void delete(ResPredefinedMessage resPredefinedMessage);

  public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage);

  public ResPredefinedMessage load(Long id);


  public List<ResPredefinedMessage> loadAll();


  public List<ResPredefinedMessage> loadByNamedQuery(String queryName);


  public List<ResPredefinedMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResPredefinedMessage> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResPredefinedMessage> loadAll(Integer startPage, Integer pageSize);

  public List<ResPredefinedMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPredefinedMessage> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResPredefinedMessage> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
