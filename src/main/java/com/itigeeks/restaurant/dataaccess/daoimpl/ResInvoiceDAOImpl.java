package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResInvoice;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResInvoiceDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResInvoiceDAOImpl extends AbstractDAO implements ResInvoiceDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResInvoice resInvoice) 
	{
		super.delete(resInvoice);
	}
	
	public ResInvoice saveOrUpdate(ResInvoice resInvoice) 
	{
		return (ResInvoice) super.saveOrUpdate(resInvoice);
	}

	public ResInvoice load(Long id )
	{
		return (ResInvoice) super.get(ResInvoice.class , id);
	}

	
	public List<ResInvoice> loadAll()
	{
		return (List<ResInvoice>) super.loadAll(ResInvoice.class);
	}


	public List<ResInvoice> loadByNamedQuery(String queryName)
	{
		
		return (List<ResInvoice>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResInvoice> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResInvoice>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResInvoice.class);
	}

	

	public List<ResInvoice> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResInvoice.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResInvoice> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResInvoice> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResInvoice>) super.load(ResInvoice.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResInvoice> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResInvoice> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResInvoice> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResInvoice>) super.load(ResInvoice.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResInvoice.class  , criteria ,conjuncationType) ;
	}
			


	

}
