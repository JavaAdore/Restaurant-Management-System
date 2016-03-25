package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProductMisc;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResProductMiscDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductMiscDAOImpl extends AbstractDAO implements ResProductMiscDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProductMisc resProductMisc) 
	{
		super.delete(resProductMisc);
	}
	
	public ResProductMisc saveOrUpdate(ResProductMisc resProductMisc) 
	{
		return (ResProductMisc) super.saveOrUpdate(resProductMisc);
	}

	public ResProductMisc load(Long id )
	{
		return (ResProductMisc) super.get(ResProductMisc.class , id);
	}

	
	public List<ResProductMisc> loadAll()
	{
		return (List<ResProductMisc>) super.loadAll(ResProductMisc.class);
	}


	public List<ResProductMisc> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProductMisc>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProductMisc> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProductMisc>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResProductMisc.class);
	}

	

	public List<ResProductMisc> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResProductMisc.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResProductMisc> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResProductMisc> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResProductMisc>) super.load(ResProductMisc.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResProductMisc> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResProductMisc>) super.load(ResProductMisc.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResProductMisc.class  , criteria ,conjuncationType) ;
	}
			


	

}
