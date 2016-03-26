package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlock;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrintBlockDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPrintBlockDAOImpl extends AbstractDAO implements ResPrintBlockDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPrintBlock resPrintBlock) {
    super.delete(resPrintBlock);
  }

  public ResPrintBlock saveOrUpdate(ResPrintBlock resPrintBlock) {
    return (ResPrintBlock) super.saveOrUpdate(resPrintBlock);
  }

  public ResPrintBlock load(Long id) {
    return (ResPrintBlock) super.get(ResPrintBlock.class, id);
  }


  public List<ResPrintBlock> loadAll() {
    return (List<ResPrintBlock>) super.loadAll(ResPrintBlock.class);
  }


  public List<ResPrintBlock> loadByNamedQuery(String queryName) {

    return (List<ResPrintBlock>) super.loadByNamedQuery(queryName);
  }


  public List<ResPrintBlock> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResPrintBlock>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPrintBlock.class);
  }



  public List<ResPrintBlock> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPrintBlock.class, startPage, pageSize);
  }



  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResPrintBlock>) super.load(ResPrintBlock.class, criteria, conjuncationType);
  }

  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPrintBlock> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPrintBlock>) super.load(ResPrintBlock.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPrintBlock.class, criteria, conjuncationType);
  }



}
