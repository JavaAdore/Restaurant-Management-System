package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCustomerDAOImpl extends AbstractDAO implements ResCustomerDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCustomer resCustomer) 
	{
		super.delete(resCustomer);
	}
	
	public ResCustomer saveOrUpdate(ResCustomer resCustomer) 
	{
		return (ResCustomer) super.saveOrUpdate(resCustomer);
	}

	public ResCustomer load(Long id )
	{
		return (ResCustomer) super.get(ResCustomer.class , id);
	}

	
	public List<ResCustomer> loadAll()
	{
		return (List<ResCustomer>) super.loadAll(ResCustomer.class);
	}


	public List<ResCustomer> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCustomer>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCustomer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCustomer>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCustomer.class);
	}

	

	public List<ResCustomer> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCustomer.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCustomer> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCustomer> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCustomer>) super.load(ResCustomer.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCustomer> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCustomer> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCustomer> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCustomer>) super.load(ResCustomer.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCustomer.class  , criteria ,conjuncationType) ;
	}
			


	

}
