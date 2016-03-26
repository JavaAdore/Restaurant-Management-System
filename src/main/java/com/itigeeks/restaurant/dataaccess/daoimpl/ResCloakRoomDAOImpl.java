package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoom;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 * 
 */
@Repository
public class ResCloakRoomDAOImpl extends AbstractDAO implements ResCloakRoomDAO, Serializable {

  private static final long serialVersionUID = 1L;

  public void delete(ResCloakRoom resCloakRoom) {
    super.delete(resCloakRoom);
  }

  public ResCloakRoom saveOrUpdate(ResCloakRoom resCloakRoom) {
    return (ResCloakRoom) super.saveOrUpdate(resCloakRoom);
  }

  public ResCloakRoom load(Long id) {
    return (ResCloakRoom) super.get(ResCloakRoom.class, id);
  }


  public List<ResCloakRoom> loadAll() {
    return (List<ResCloakRoom>) super.loadAll(ResCloakRoom.class);
  }


  public List<ResCloakRoom> loadByNamedQuery(String queryName) {

    return (List<ResCloakRoom>) super.loadByNamedQuery(queryName);
  }


  public List<ResCloakRoom> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
    return (List<ResCloakRoom>) super.loadByNamedQuery(queryName, queryParameters);
  }



  public Integer countAll() {
    return super.countAll(ResCloakRoom.class);
  }



  public List<ResCloakRoom> loadAll(Integer startPage, Integer pageSize) {
    return super.loadAll(ResCloakRoom.class, startPage, pageSize);
  }



  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria) {
    return this.load(criteria, QueryConjunctionType.AND);
  }

  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {

    return (List<ResCloakRoom>) super.load(ResCloakRoom.class, criteria, conjuncationType);
  }

  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      QueryConjunctionType conjuncationType) {

    return this.load(criteria, startPage, pageSize, null, null, conjuncationType);
  }


  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize) {

    return this.load(criteria, startPage, pageSize, null, null, QueryConjunctionType.AND);

  }

  @Override
  public List<ResCloakRoom> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,
      String sortField, Boolean ascending, QueryConjunctionType conjuncationType) {

    return (List<ResCloakRoom>) super.load(ResCloakRoom.class, criteria, startPage, pageSize,
        sortField, ascending, conjuncationType);
  }


  @Override
  public Integer getCount(Map<String, Object> criteria) {
    return this.getCount(criteria, QueryConjunctionType.AND);
  }

  @Override
  public Integer getCount(Map<String, Object> criteria, QueryConjunctionType conjuncationType) {
    return super.getCount(ResCloakRoom.class, criteria, conjuncationType);
  }



}
