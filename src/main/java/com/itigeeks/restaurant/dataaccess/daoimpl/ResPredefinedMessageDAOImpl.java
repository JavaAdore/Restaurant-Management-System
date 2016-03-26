package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPredefinedMessageDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPredefinedMessageDAOImpl extends AbstractDAO implements ResPredefinedMessageDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPredefinedMessage resPredefinedMessage) {
    super.delete(resPredefinedMessage);
  }

  public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage) {
    return (ResPredefinedMessage) super.saveOrUpdate(resPredefinedMessage);
  }

  public ResPredefinedMessage load(Long id) {
    return (ResPredefinedMessage) super.get(ResPredefinedMessage.class, id);
  }


  public List<ResPredefinedMessage> loadAll() {
    return (List<ResPredefinedMessage>) super.loadAll(ResPredefinedMessage.class);
  }


  public List<ResPredefinedMessage> loadByNamedQuery(String queryName) {

    return (List<ResPredefinedMessage>) super.loadByNamedQuery(queryName);
  }


  public List<ResPredefinedMessage> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResPredefinedMessage>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPredefinedMessage.class);
  }



  public List<ResPredefinedMessage> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPredefinedMessage.class, startPage, pageSize);
  }



  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResPredefinedMessage>) super.load(ResPredefinedMessage.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPredefinedMessage> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPredefinedMessage>) super.load(ResPredefinedMessage.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPredefinedMessage.class, criteria, conjuncationType);
  }



}
