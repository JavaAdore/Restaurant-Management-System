package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDepositType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDepositTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResDepositTypeDAOImpl extends AbstractDAO implements ResDepositTypeDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResDepositType resDepositType) {
    super.delete(resDepositType);
  }

  public ResDepositType saveOrUpdate(ResDepositType resDepositType) {
    return (ResDepositType) super.saveOrUpdate(resDepositType);
  }

  public ResDepositType load(Long id) {
    return (ResDepositType) super.get(ResDepositType.class, id);
  }


  public List<ResDepositType> loadAll() {
    return (List<ResDepositType>) super.loadAll(ResDepositType.class);
  }


  public List<ResDepositType> loadByNamedQuery(String queryName) {

    return (List<ResDepositType>) super.loadByNamedQuery(queryName);
  }


  public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResDepositType>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResDepositType.class);
  }



  public List<ResDepositType> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResDepositType.class, startPage, pageSize);
  }



  @Override
  public List<ResDepositType> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResDepositType> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResDepositType>) super.load(ResDepositType.class, criteria, conjuncationType);
  }

  @Override
  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResDepositType> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResDepositType>) super.load(ResDepositType.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResDepositType.class, criteria, conjuncationType);
  }



}
