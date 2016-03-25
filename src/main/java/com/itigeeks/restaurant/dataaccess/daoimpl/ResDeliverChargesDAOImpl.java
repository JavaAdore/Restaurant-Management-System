package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliverCharges;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResDeliverChargesDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDeliverChargesDAOImpl extends AbstractDAO implements ResDeliverChargesDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDeliverCharges resDeliverCharges) 
	{
		super.delete(resDeliverCharges);
	}
	
	public ResDeliverCharges saveOrUpdate(ResDeliverCharges resDeliverCharges) 
	{
		return (ResDeliverCharges) super.saveOrUpdate(resDeliverCharges);
	}

	public ResDeliverCharges load(Long id )
	{
		return (ResDeliverCharges) super.get(ResDeliverCharges.class , id);
	}

	
	public List<ResDeliverCharges> loadAll()
	{
		return (List<ResDeliverCharges>) super.loadAll(ResDeliverCharges.class);
	}


	public List<ResDeliverCharges> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDeliverCharges>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDeliverCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDeliverCharges>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResDeliverCharges.class);
	}

	

	public List<ResDeliverCharges> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDeliverCharges.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResDeliverCharges> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResDeliverCharges> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResDeliverCharges>) super.load(ResDeliverCharges.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResDeliverCharges> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResDeliverCharges> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResDeliverCharges> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResDeliverCharges>) super.load(ResDeliverCharges.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResDeliverCharges.class  , criteria ,conjuncationType) ;
	}
			


	

}
