package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResAdditionalCompanyDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResAdditionalCompanyDAOImpl extends AbstractDAO implements ResAdditionalCompanyDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResAdditionalCompany resAdditionalCompany) {
    super.delete(resAdditionalCompany);
  }

  public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany) {
    return (ResAdditionalCompany) super.saveOrUpdate(resAdditionalCompany);
  }

  public ResAdditionalCompany load(Long id) {
    return (ResAdditionalCompany) super.get(ResAdditionalCompany.class, id);
  }


  public List<ResAdditionalCompany> loadAll() {
    return (List<ResAdditionalCompany>) super.loadAll(ResAdditionalCompany.class);
  }


  public List<ResAdditionalCompany> loadByNamedQuery(String queryName) {

    return (List<ResAdditionalCompany>) super.loadByNamedQuery(queryName);
  }


  public List<ResAdditionalCompany> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResAdditionalCompany>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResAdditionalCompany.class);
  }



  public List<ResAdditionalCompany> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResAdditionalCompany.class, startPage, pageSize);
  }



  @Override
  public List<ResAdditionalCompany> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResAdditionalCompany> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResAdditionalCompany>) super.load(ResAdditionalCompany.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResAdditionalCompany> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResAdditionalCompany>) super.load(ResAdditionalCompany.class, criteria, startPage,
        pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResAdditionalCompany.class, criteria, conjuncationType);
  }



}
