package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductAddonDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResProductAddonDAOImpl extends AbstractDAO implements ResProductAddonDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResProductAddon resProductAddon) {
    super.delete(resProductAddon);
  }

  public ResProductAddon saveOrUpdate(ResProductAddon resProductAddon) {
    return (ResProductAddon) super.saveOrUpdate(resProductAddon);
  }

  public ResProductAddon load(Long id) {
    return (ResProductAddon) super.get(ResProductAddon.class, id);
  }


  public List<ResProductAddon> loadAll() {
    return (List<ResProductAddon>) super.loadAll(ResProductAddon.class);
  }


  public List<ResProductAddon> loadByNamedQuery(String queryName) {

    return (List<ResProductAddon>) super.loadByNamedQuery(queryName);
  }


  public List<ResProductAddon> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResProductAddon>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResProductAddon.class);
  }



  public List<ResProductAddon> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResProductAddon.class, startPage, pageSize);
  }



  @Override
  public List<ResProductAddon> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResProductAddon> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResProductAddon>) super.load(ResProductAddon.class, criteria, conjuncationType);
  }

  @Override
  public List<ResProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResProductAddon>) super.load(ResProductAddon.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResProductAddon.class, criteria, conjuncationType);
  }



}
