package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderProductAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderProductAddonDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResOrderProductAddonDAOImpl extends AbstractDAO implements ResOrderProductAddonDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResOrderProductAddon resOrderProductAddon) {
    super.delete(resOrderProductAddon);
  }

  public ResOrderProductAddon saveOrUpdate(ResOrderProductAddon resOrderProductAddon) {
    return (ResOrderProductAddon) super.saveOrUpdate(resOrderProductAddon);
  }

  public ResOrderProductAddon load(Long id) {
    return (ResOrderProductAddon) super.get(ResOrderProductAddon.class, id);
  }


  public List<ResOrderProductAddon> loadAll() {
    return (List<ResOrderProductAddon>) super.loadAll(ResOrderProductAddon.class);
  }


  public List<ResOrderProductAddon> loadByNamedQuery(String queryName) {

    return (List<ResOrderProductAddon>) super.loadByNamedQuery(queryName);
  }


  public List<ResOrderProductAddon> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResOrderProductAddon>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResOrderProductAddon.class);
  }



  public List<ResOrderProductAddon> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResOrderProductAddon.class, startPage, pageSize);
  }



  @Override
  public List<ResOrderProductAddon> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResOrderProductAddon> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResOrderProductAddon>) super.load(ResOrderProductAddon.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResOrderProductAddon> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResOrderProductAddon>) super.load(ResOrderProductAddon.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResOrderProductAddon.class, criteria, conjuncationType);
  }



}
