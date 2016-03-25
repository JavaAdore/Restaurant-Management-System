package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLoyaltyPoints;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLoyaltyPointsDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResLoyaltyPointsDAOImpl extends AbstractDAO implements ResLoyaltyPointsDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResLoyaltyPoints resLoyaltyPoints) 
	{
		super.delete(resLoyaltyPoints);
	}
	
	public ResLoyaltyPoints saveOrUpdate(ResLoyaltyPoints resLoyaltyPoints) 
	{
		return (ResLoyaltyPoints) super.saveOrUpdate(resLoyaltyPoints);
	}

	public ResLoyaltyPoints load(Long id )
	{
		return (ResLoyaltyPoints) super.get(ResLoyaltyPoints.class , id);
	}

	
	public List<ResLoyaltyPoints> loadAll()
	{
		return (List<ResLoyaltyPoints>) super.loadAll(ResLoyaltyPoints.class);
	}


	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName)
	{
		
		return (List<ResLoyaltyPoints>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResLoyaltyPoints> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResLoyaltyPoints>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResLoyaltyPoints.class);
	}

	

	public List<ResLoyaltyPoints> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResLoyaltyPoints.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResLoyaltyPoints> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResLoyaltyPoints> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResLoyaltyPoints>) super.load(ResLoyaltyPoints.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResLoyaltyPoints> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResLoyaltyPoints>) super.load(ResLoyaltyPoints.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResLoyaltyPoints.class  , criteria ,conjuncationType) ;
	}
			


	

}
