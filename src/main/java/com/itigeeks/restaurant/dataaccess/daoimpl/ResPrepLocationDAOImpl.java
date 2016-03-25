package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResPrepLocationDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrepLocationDAOImpl extends AbstractDAO implements ResPrepLocationDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrepLocation resPrepLocation) 
	{
		super.delete(resPrepLocation);
	}
	
	public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation) 
	{
		return (ResPrepLocation) super.saveOrUpdate(resPrepLocation);
	}

	public ResPrepLocation load(Long id )
	{
		return (ResPrepLocation) super.get(ResPrepLocation.class , id);
	}

	
	public List<ResPrepLocation> loadAll()
	{
		return (List<ResPrepLocation>) super.loadAll(ResPrepLocation.class);
	}


	public List<ResPrepLocation> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrepLocation>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrepLocation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrepLocation>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResPrepLocation.class);
	}

	

	public List<ResPrepLocation> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPrepLocation.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResPrepLocation> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResPrepLocation> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResPrepLocation>) super.load(ResPrepLocation.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResPrepLocation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResPrepLocation> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResPrepLocation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResPrepLocation>) super.load(ResPrepLocation.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResPrepLocation.class  , criteria ,conjuncationType) ;
	}
			


	

}
