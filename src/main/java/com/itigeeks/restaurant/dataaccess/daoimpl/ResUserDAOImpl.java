package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResUserDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResUserDAOImpl extends AbstractDAO implements ResUserDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResUser resUser) 
	{
		super.delete(resUser);
	}
	
	public ResUser saveOrUpdate(ResUser resUser) 
	{
		return (ResUser) super.saveOrUpdate(resUser);
	}

	public ResUser load(Long id )
	{
		return (ResUser) super.get(ResUser.class , id);
	}

	
	public List<ResUser> loadAll()
	{
		return (List<ResUser>) super.loadAll(ResUser.class);
	}


	public List<ResUser> loadByNamedQuery(String queryName)
	{
		
		return (List<ResUser>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResUser> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResUser>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResUser.class);
	}

	

	public List<ResUser> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResUser.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResUser> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResUser> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResUser>) super.load(ResUser.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResUser> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResUser> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResUser>) super.load(ResUser.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResUser.class  , criteria ,conjuncationType) ;
	}
			


	

}
