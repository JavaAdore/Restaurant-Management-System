package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResSettingsDAOImpl extends AbstractDAO implements ResSettingsDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResSettings resSettings) {
    super.delete(resSettings);
  }

  public ResSettings saveOrUpdate(ResSettings resSettings) {
    return (ResSettings) super.saveOrUpdate(resSettings);
  }

  public ResSettings load(Long id) {
    return (ResSettings) super.get(ResSettings.class, id);
  }


  public List<ResSettings> loadAll() {
    return (List<ResSettings>) super.loadAll(ResSettings.class);
  }


  public List<ResSettings> loadByNamedQuery(String queryName) {

    return (List<ResSettings>) super.loadByNamedQuery(queryName);
  }


  public List<ResSettings> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResSettings>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResSettings.class);
  }



  public List<ResSettings> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResSettings.class, startPage, pageSize);
  }



  @Override
  public List<ResSettings> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResSettings> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResSettings>) super.load(ResSettings.class, criteria, conjuncationType);
  }

  @Override
  public List<ResSettings> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResSettings> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResSettings> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResSettings>) super.load(ResSettings.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResSettings.class, criteria, conjuncationType);
  }



}
