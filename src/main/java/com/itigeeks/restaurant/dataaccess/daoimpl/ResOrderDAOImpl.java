package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrder;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderDAOImpl extends AbstractDAO implements ResOrderDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrder resOrder) 
	{
		super.delete(resOrder);
	}
	
	public ResOrder saveOrUpdate(ResOrder resOrder) 
	{
		return (ResOrder) super.saveOrUpdate(resOrder);
	}

	public ResOrder load(Long id )
	{
		return (ResOrder) super.get(ResOrder.class , id);
	}

	
	public List<ResOrder> loadAll()
	{
		return (List<ResOrder>) super.loadAll(ResOrder.class);
	}


	public List<ResOrder> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrder>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrder>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResOrder.class);
	}

	

	public List<ResOrder> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrder.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResOrder> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResOrder> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResOrder>) super.load(ResOrder.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResOrder> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResOrder> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResOrder> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResOrder>) super.load(ResOrder.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResOrder.class  , criteria ,conjuncationType) ;
	}
			


	

}
