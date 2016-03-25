package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCountry;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCountryDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCountryDAOImpl extends AbstractDAO implements ResCountryDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCountry resCountry) 
	{
		super.delete(resCountry);
	}
	
	public ResCountry saveOrUpdate(ResCountry resCountry) 
	{
		return (ResCountry) super.saveOrUpdate(resCountry);
	}

	public ResCountry load(Long id )
	{
		return (ResCountry) super.get(ResCountry.class , id);
	}

	
	public List<ResCountry> loadAll()
	{
		return (List<ResCountry>) super.loadAll(ResCountry.class);
	}


	public List<ResCountry> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCountry>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCountry> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCountry>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCountry.class);
	}

	

	public List<ResCountry> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCountry.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCountry> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCountry> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCountry>) super.load(ResCountry.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCountry> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCountry> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCountry> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCountry>) super.load(ResCountry.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCountry.class  , criteria ,conjuncationType) ;
	}
			


	

}
