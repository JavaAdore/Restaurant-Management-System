package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscount;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDiscountDAOImpl extends AbstractDAO implements ResDiscountDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDiscount resDiscount) 
	{
		super.delete(resDiscount);
	}
	
	public ResDiscount saveOrUpdate(ResDiscount resDiscount) 
	{
		return (ResDiscount) super.saveOrUpdate(resDiscount);
	}

	public ResDiscount load(Long id )
	{
		return (ResDiscount) super.get(ResDiscount.class , id);
	}

	
	public List<ResDiscount> loadAll()
	{
		return (List<ResDiscount>) super.loadAll(ResDiscount.class);
	}


	public List<ResDiscount> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDiscount>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDiscount>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResDiscount.class);
	}

	

	public List<ResDiscount> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDiscount.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResDiscount> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResDiscount> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResDiscount>) super.load(ResDiscount.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResDiscount> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResDiscount>) super.load(ResDiscount.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResDiscount.class  , criteria ,conjuncationType) ;
	}
			


	

}
