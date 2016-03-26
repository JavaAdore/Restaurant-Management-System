package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrinterModelDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResPrinterModelDAOImpl extends AbstractDAO implements ResPrinterModelDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResPrinterModel resPrinterModel) {
    super.delete(resPrinterModel);
  }

  public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel) {
    return (ResPrinterModel) super.saveOrUpdate(resPrinterModel);
  }

  public ResPrinterModel load(Long id) {
    return (ResPrinterModel) super.get(ResPrinterModel.class, id);
  }


  public List<ResPrinterModel> loadAll() {
    return (List<ResPrinterModel>) super.loadAll(ResPrinterModel.class);
  }


  public List<ResPrinterModel> loadByNamedQuery(String queryName) {

    return (List<ResPrinterModel>) super.loadByNamedQuery(queryName);
  }


  public List<ResPrinterModel> loadByNamedQuery(String queryName,
      Map<String, Object> queryParameters) {
    return (List<ResPrinterModel>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResPrinterModel.class);
  }



  public List<ResPrinterModel> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResPrinterModel.class, startPage, pageSize);
  }



  @Override
  public List<ResPrinterModel> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResPrinterModel> load(Map<String, Object> criteria,
      QueryConjunctionType conjuncationType) {

    return (List<ResPrinterModel>) super.load(ResPrinterModel.class, criteria, conjuncationType);
  }

  @Override
  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResPrinterModel> load(Map<String, Object> criteria, Integer startPage,
      Integer pageSize, String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResPrinterModel>) super.load(ResPrinterModel.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResPrinterModel.class, criteria, conjuncationType);
  }



}
