package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityTypeConversion;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResQuantityTypeConversionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResQuantityTypeConversionDAOImpl extends AbstractDAO implements ResQuantityTypeConversionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResQuantityTypeConversion resQuantityTypeConversion) 
	{
		super.delete(resQuantityTypeConversion);
	}
	
	public ResQuantityTypeConversion saveOrUpdate(ResQuantityTypeConversion resQuantityTypeConversion) 
	{
		return (ResQuantityTypeConversion) super.saveOrUpdate(resQuantityTypeConversion);
	}

	public ResQuantityTypeConversion load(Long id )
	{
		return (ResQuantityTypeConversion) super.get(ResQuantityTypeConversion.class , id);
	}

	
	public List<ResQuantityTypeConversion> loadAll()
	{
		return (List<ResQuantityTypeConversion>) super.loadAll(ResQuantityTypeConversion.class);
	}


	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName)
	{
		
		return (List<ResQuantityTypeConversion>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResQuantityTypeConversion>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResQuantityTypeConversion.class);
	}

	

	public List<ResQuantityTypeConversion> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResQuantityTypeConversion.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResQuantityTypeConversion>) super.load(ResQuantityTypeConversion.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResQuantityTypeConversion> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResQuantityTypeConversion>) super.load(ResQuantityTypeConversion.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResQuantityTypeConversion.class  , criteria ,conjuncationType) ;
	}
			


	

}
