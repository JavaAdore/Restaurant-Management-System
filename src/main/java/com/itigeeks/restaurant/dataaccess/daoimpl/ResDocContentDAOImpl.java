package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDocContent;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDocContentDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDocContentDAOImpl extends AbstractDAO implements ResDocContentDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDocContent resDocContent) 
	{
		super.delete(resDocContent);
	}
	
	public ResDocContent saveOrUpdate(ResDocContent resDocContent) 
	{
		return (ResDocContent) super.saveOrUpdate(resDocContent);
	}

	public ResDocContent load(Long id )
	{
		return (ResDocContent) super.get(ResDocContent.class , id);
	}

	
	public List<ResDocContent> loadAll()
	{
		return (List<ResDocContent>) super.loadAll(ResDocContent.class);
	}


	public List<ResDocContent> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDocContent>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDocContent> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDocContent>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResDocContent.class);
	}

	

	public List<ResDocContent> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDocContent.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResDocContent> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResDocContent> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResDocContent>) super.load(ResDocContent.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResDocContent> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResDocContent>) super.load(ResDocContent.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResDocContent.class  , criteria ,conjuncationType) ;
	}
			


	

}
