package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlockCategory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockCategoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPrintBlockCategoryDAOImpl extends AbstractDAO implements ResPrintBlockCategoryDAO,
    Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPrintBlockCategory resPrintBlockCategory) {
    super.delete(resPrintBlockCategory);
  }

  public ResPrintBlockCategory saveOrUpdate(ResPrintBlockCategory resPrintBlockCategory) {
    return (ResPrintBlockCategory) super.saveOrUpdate(resPrintBlockCategory);
  }

  public ResPrintBlockCategory load(Long id) {
    return (ResPrintBlockCategory) super.get(ResPrintBlockCategory.class, id);
  }


  public List<ResPrintBlockCategory> loadAll() {
    return (List<ResPrintBlockCategory>) super.loadAll(ResPrintBlockCategory.class);
  }


  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName) {

    return (List<ResPrintBlockCategory>) super.loadByNamedQuery(queryName);
  }


  public List<ResPrintBlockCategory> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResPrintBlockCategory>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPrintBlockCategory.class);
  }



  public List<ResPrintBlockCategory> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPrintBlockCategory.class, startPage, pageSize);
  }



  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResPrintBlockCategory>) super.load(ResPrintBlockCategory.class, criteria,
        conjuncationType);
  }

  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPrintBlockCategory> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPrintBlockCategory>) super.load(ResPrintBlockCategory.class, criteria,
        startPage, pageSize, sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPrintBlockCategory.class, criteria, conjuncationType);
  }



}
