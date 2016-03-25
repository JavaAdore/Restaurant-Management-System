package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderChild;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderChildDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderChildDAOImpl extends AbstractDAO implements ResOrderChildDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderChild resOrderChild) 
	{
		super.delete(resOrderChild);
	}
	
	public ResOrderChild saveOrUpdate(ResOrderChild resOrderChild) 
	{
		return (ResOrderChild) super.saveOrUpdate(resOrderChild);
	}

	public ResOrderChild load(Long id )
	{
		return (ResOrderChild) super.get(ResOrderChild.class , id);
	}

	
	public List<ResOrderChild> loadAll()
	{
		return (List<ResOrderChild>) super.loadAll(ResOrderChild.class);
	}


	public List<ResOrderChild> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderChild>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderChild> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderChild>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResOrderChild.class);
	}

	

	public List<ResOrderChild> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderChild.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResOrderChild> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResOrderChild> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResOrderChild>) super.load(ResOrderChild.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResOrderChild> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResOrderChild>) super.load(ResOrderChild.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResOrderChild.class  , criteria ,conjuncationType) ;
	}
			


	

}
