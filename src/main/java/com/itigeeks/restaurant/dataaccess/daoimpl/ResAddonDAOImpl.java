package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAddon;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAddonDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResAddonDAOImpl extends AbstractDAO implements ResAddonDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResAddon resAddon) {
    super.delete(resAddon);
  }

  public ResAddon saveOrUpdate(ResAddon resAddon) {
    return (ResAddon) super.saveOrUpdate(resAddon);
  }

  public ResAddon load(Long id) {
    return (ResAddon) super.get(ResAddon.class, id);
  }


  public List<ResAddon> loadAll() {
    return (List<ResAddon>) super.loadAll(ResAddon.class);
  }


  public List<ResAddon> loadByNamedQuery(String queryName) {

    return (List<ResAddon>) super.loadByNamedQuery(queryName);
  }


  public List<ResAddon> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResAddon>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResAddon.class);
  }



  public List<ResAddon> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResAddon.class, startPage, pageSize);
  }



  @Override
  public List<ResAddon> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResAddon> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResAddon>) super.load(ResAddon.class, criteria, conjuncationType);
  }

  @Override
  public List<ResAddon> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResAddon> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResAddon> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResAddon>) super.load(ResAddon.class, criteria, startPage, pageSize, sortField,
        ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResAddon.class, criteria, conjuncationType);
  }



}
