package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;

/**
 * 
 * @author ITI GEEKS
 * 
 */

@Service
public interface ResCustomerCommentService {


  public void delete(ResCustomerComment resCustomerComment);

  public ResCustomerComment saveOrUpdate(ResCustomerComment resCustomerComment);

  public ResCustomerComment load(Long id);


  public List<ResCustomerComment> loadAll();


  public List<ResCustomerComment> loadByNamedQuery(String queryName);


  public List<ResCustomerComment> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters);


  public List<ResCustomerComment> load(Map<String, Object> criteria);


  public Integer countAll();


  public List<ResCustomerComment> loadAll(Integer startPage, Integer pageSize);

  public List<ResCustomerComment> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize);

  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria);

  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCustomerComment> loadWithAllCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);

  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria);

  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize);

  public List<ResCustomerComment> loadWithAnyCriteria(Map<String, Object> criteria,
      Integer startPage, Integer pageSize, String sortField, Boolean ascending);


  public Integer getCount(Map<String, Object> criteria);

  public Integer getCountOfAllCriteria(Map<String, Object> criteria);

  public Integer getCountOfWithAnyCriteria(Map<String, Object> criteria);



}
