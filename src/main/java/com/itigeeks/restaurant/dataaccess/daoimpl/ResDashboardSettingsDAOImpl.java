package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDashboardSettings;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDashboardSettingsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResDashboardSettingsDAOImpl extends AbstractDAO implements ResDashboardSettingsDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResDashboardSettings resDashboardSettings) {
    super.delete(resDashboardSettings);
  }

  public ResDashboardSettings saveOrUpdate(ResDashboardSettings resDashboardSettings) {
    return (ResDashboardSettings) super.saveOrUpdate(resDashboardSettings);
  }

  public ResDashboardSettings load(Long id) {
    return (ResDashboardSettings) super.get(ResDashboardSettings.class, id);
  }


  public List<ResDashboardSettings> loadAll() {
    return (List<ResDashboardSettings>) super.loadAll(ResDashboardSettings.class);
  }


  public List<ResDashboardSettings> loadByNamedQuery(String queryName) {

    return (List<ResDashboardSettings>) super.loadByNamedQuery(queryName);
  }


  public List<ResDashboardSettings> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResDashboardSettings>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResDashboardSettings.class);
  }



  public List<ResDashboardSettings> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResDashboardSettings.class, startPage, pageSize);
  }



  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResDashboardSettings>) super.load(ResDashboardSettings.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResDashboardSettings> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResDashboardSettings>) super.load(ResDashboardSettings.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResDashboardSettings.class, criteria, conjuncationType);
  }



}
