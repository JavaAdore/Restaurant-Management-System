package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResButtonPermissionSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResButtonPermissionSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResButtonPermissionSettingsDAOImpl extends AbstractDAO implements
    ResButtonPermissionSettingsDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResButtonPermissionSettings resButtonPermissionSettings) {
    super.delete(resButtonPermissionSettings);
  }

  public ResButtonPermissionSettings saveOrUpdate(
      ResButtonPermissionSettings resButtonPermissionSettings) {
    return (ResButtonPermissionSettings) super.saveOrUpdate(resButtonPermissionSettings);
  }

  public ResButtonPermissionSettings load(Long id) {
    return (ResButtonPermissionSettings) super.get(ResButtonPermissionSettings.class, id);
  }


  public List<ResButtonPermissionSettings> loadAll() {
    return (List<ResButtonPermissionSettings>) super.loadAll(ResButtonPermissionSettings.class);
  }


  public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName) {

    return (List<ResButtonPermissionSettings>) super.loadByNamedQuery(queryName);
  }


  public List<ResButtonPermissionSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResButtonPermissionSettings>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResButtonPermissionSettings.class);
  }



  public List<ResButtonPermissionSettings> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResButtonPermissionSettings.class, startPage, pageSize);
  }



  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResButtonPermissionSettings>) super.load(ResButtonPermissionSettings.class,
        criteria, conjuncationType);
  }

  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResButtonPermissionSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResButtonPermissionSettings>) super.load(ResButtonPermissionSettings.class,
        criteria, startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResButtonPermissionSettings.class, criteria, conjuncationType);
  }



}
