package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderActionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderActionTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderActionTypeDAOImpl extends AbstractDAO implements ResOrderActionTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderActionType resOrderActionType) 
	{
		super.delete(resOrderActionType);
	}
	
	public ResOrderActionType saveOrUpdate(ResOrderActionType resOrderActionType) 
	{
		return (ResOrderActionType) super.saveOrUpdate(resOrderActionType);
	}

	public ResOrderActionType load(Long id )
	{
		return (ResOrderActionType) super.get(ResOrderActionType.class , id);
	}

	
	public List<ResOrderActionType> loadAll()
	{
		return (List<ResOrderActionType>) super.loadAll(ResOrderActionType.class);
	}


	public List<ResOrderActionType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderActionType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderActionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderActionType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResOrderActionType.class);
	}

	

	public List<ResOrderActionType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderActionType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResOrderActionType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResOrderActionType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResOrderActionType>) super.load(ResOrderActionType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResOrderActionType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResOrderActionType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResOrderActionType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResOrderActionType>) super.load(ResOrderActionType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResOrderActionType.class  , criteria ,conjuncationType) ;
	}
			


	

}
