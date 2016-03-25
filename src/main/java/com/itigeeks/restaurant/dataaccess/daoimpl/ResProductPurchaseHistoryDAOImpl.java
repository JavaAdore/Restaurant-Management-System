package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductPurchaseHistory;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductPurchaseHistoryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductPurchaseHistoryDAOImpl extends AbstractDAO implements ResProductPurchaseHistoryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductPurchaseHistory resProductPurchaseHistory) 
	{
		super.delete(resProductPurchaseHistory);
	}
	
	public ResProductPurchaseHistory saveOrUpdate(ResProductPurchaseHistory resProductPurchaseHistory) 
	{
		return (ResProductPurchaseHistory) super.saveOrUpdate(resProductPurchaseHistory);
	}

	public ResProductPurchaseHistory load(Long id )
	{
		return (ResProductPurchaseHistory) super.get(ResProductPurchaseHistory.class , id);
	}

	
	public List<ResProductPurchaseHistory> loadAll()
	{
		return (List<ResProductPurchaseHistory>) super.loadAll(ResProductPurchaseHistory.class);
	}


	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductPurchaseHistory>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductPurchaseHistory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductPurchaseHistory>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResProductPurchaseHistory.class);
	}

	

	public List<ResProductPurchaseHistory> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResProductPurchaseHistory.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResProductPurchaseHistory> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResProductPurchaseHistory> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResProductPurchaseHistory>) super.load(ResProductPurchaseHistory.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResProductPurchaseHistory> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResProductPurchaseHistory>) super.load(ResProductPurchaseHistory.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResProductPurchaseHistory.class  , criteria ,conjuncationType) ;
	}
			


	

}
