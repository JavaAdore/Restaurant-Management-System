package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCloakRoomStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCloakRoomStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCloakRoomStatusDAOImpl extends AbstractDAO implements ResCloakRoomStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCloakRoomStatus resCloakRoomStatus) 
	{
		super.delete(resCloakRoomStatus);
	}
	
	public ResCloakRoomStatus saveOrUpdate(ResCloakRoomStatus resCloakRoomStatus) 
	{
		return (ResCloakRoomStatus) super.saveOrUpdate(resCloakRoomStatus);
	}

	public ResCloakRoomStatus load(Long id )
	{
		return (ResCloakRoomStatus) super.get(ResCloakRoomStatus.class , id);
	}

	
	public List<ResCloakRoomStatus> loadAll()
	{
		return (List<ResCloakRoomStatus>) super.loadAll(ResCloakRoomStatus.class);
	}


	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCloakRoomStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCloakRoomStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCloakRoomStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCloakRoomStatus.class);
	}

	

	public List<ResCloakRoomStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCloakRoomStatus.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCloakRoomStatus>) super.load(ResCloakRoomStatus.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCloakRoomStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCloakRoomStatus>) super.load(ResCloakRoomStatus.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCloakRoomStatus.class  , criteria ,conjuncationType) ;
	}
			


	

}
