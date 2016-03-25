package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResLogType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResLogTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResLogTypeDAOImpl extends AbstractDAO implements ResLogTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResLogType resLogType) 
	{
		super.delete(resLogType);
	}
	
	public ResLogType saveOrUpdate(ResLogType resLogType) 
	{
		return (ResLogType) super.saveOrUpdate(resLogType);
	}

	public ResLogType load(Long id )
	{
		return (ResLogType) super.get(ResLogType.class , id);
	}

	
	public List<ResLogType> loadAll()
	{
		return (List<ResLogType>) super.loadAll(ResLogType.class);
	}


	public List<ResLogType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResLogType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResLogType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResLogType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResLogType.class);
	}

	

	public List<ResLogType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResLogType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResLogType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResLogType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResLogType>) super.load(ResLogType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResLogType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResLogType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResLogType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResLogType>) super.load(ResLogType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResLogType.class  , criteria ,conjuncationType) ;
	}
			


	

}
