package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDbbackupSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDbbackupSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResDbbackupSettingsDAOImpl extends AbstractDAO implements ResDbbackupSettingsDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResDbbackupSettings resDbbackupSettings) {
    super.delete(resDbbackupSettings);
  }

  public ResDbbackupSettings saveOrUpdate(ResDbbackupSettings resDbbackupSettings) {
    return (ResDbbackupSettings) super.saveOrUpdate(resDbbackupSettings);
  }

  public ResDbbackupSettings load(Long id) {
    return (ResDbbackupSettings) super.get(ResDbbackupSettings.class, id);
  }


  public List<ResDbbackupSettings> loadAll() {
    return (List<ResDbbackupSettings>) super.loadAll(ResDbbackupSettings.class);
  }


  public List<ResDbbackupSettings> loadByNamedQuery(String queryName) {

    return (List<ResDbbackupSettings>) super.loadByNamedQuery(queryName);
  }


  public List<ResDbbackupSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResDbbackupSettings>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResDbbackupSettings.class);
  }



  public List<ResDbbackupSettings> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResDbbackupSettings.class, startPage, pageSize);
  }



  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResDbbackupSettings>) super.load(ResDbbackupSettings.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResDbbackupSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResDbbackupSettings>) super.load(ResDbbackupSettings.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResDbbackupSettings.class, criteria, conjuncationType);
  }



}
