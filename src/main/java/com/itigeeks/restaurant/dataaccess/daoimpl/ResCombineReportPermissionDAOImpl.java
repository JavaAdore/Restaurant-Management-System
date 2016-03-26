package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCombineReportPermission;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCombineReportPermissionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCombineReportPermissionDAOImpl extends AbstractDAO implements
    ResCombineReportPermissionDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCombineReportPermission resCombineReportPermission) {
    super.delete(resCombineReportPermission);
  }

  public ResCombineReportPermission saveOrUpdate(
      ResCombineReportPermission resCombineReportPermission) {
    return (ResCombineReportPermission) super.saveOrUpdate(resCombineReportPermission);
  }

  public ResCombineReportPermission load(Long id) {
    return (ResCombineReportPermission) super.get(ResCombineReportPermission.class, id);
  }


  public List<ResCombineReportPermission> loadAll() {
    return (List<ResCombineReportPermission>) super.loadAll(ResCombineReportPermission.class);
  }


  public List<ResCombineReportPermission> loadByNamedQuery(String queryName) {

    return (List<ResCombineReportPermission>) super.loadByNamedQuery(queryName);
  }


  public List<ResCombineReportPermission> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResCombineReportPermission>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCombineReportPermission.class);
  }



  public List<ResCombineReportPermission> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCombineReportPermission.class, startPage, pageSize);
  }



  @Override
  public List<ResCombineReportPermission> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCombineReportPermission> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResCombineReportPermission>) super.load(ResCombineReportPermission.class,
        criteria, conjuncationType);
  }

  @Override
  public List<ResCombineReportPermission> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCombineReportPermission> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCombineReportPermission> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCombineReportPermission>) super.load(ResCombineReportPermission.class,
        criteria, startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCombineReportPermission.class, criteria, conjuncationType);
  }



}
