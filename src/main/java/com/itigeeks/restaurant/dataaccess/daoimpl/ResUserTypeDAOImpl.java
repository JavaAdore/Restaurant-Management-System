package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUserType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResUserTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResUserTypeDAOImpl extends AbstractDAO implements ResUserTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResUserType resUserType) 
	{
		super.delete(resUserType);
	}
	
	public ResUserType saveOrUpdate(ResUserType resUserType) 
	{
		return (ResUserType) super.saveOrUpdate(resUserType);
	}

	public ResUserType load(Long id )
	{
		return (ResUserType) super.get(ResUserType.class , id);
	}

	
	public List<ResUserType> loadAll()
	{
		return (List<ResUserType>) super.loadAll(ResUserType.class);
	}


	public List<ResUserType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResUserType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResUserType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResUserType.class);
	}

	

	public List<ResUserType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResUserType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResUserType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResUserType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResUserType>) super.load(ResUserType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResUserType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResUserType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResUserType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResUserType>) super.load(ResUserType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResUserType.class  , criteria ,conjuncationType) ;
	}
			


	

}
