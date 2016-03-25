package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResModem;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResModemDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResModemDAOImpl extends AbstractDAO implements ResModemDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResModem resModem) 
	{
		super.delete(resModem);
	}
	
	public ResModem saveOrUpdate(ResModem resModem) 
	{
		return (ResModem) super.saveOrUpdate(resModem);
	}

	public ResModem load(Long id )
	{
		return (ResModem) super.get(ResModem.class , id);
	}

	
	public List<ResModem> loadAll()
	{
		return (List<ResModem>) super.loadAll(ResModem.class);
	}


	public List<ResModem> loadByNamedQuery(String queryName)
	{
		
		return (List<ResModem>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResModem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResModem>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResModem.class);
	}

	

	public List<ResModem> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResModem.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResModem> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResModem> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResModem>) super.load(ResModem.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResModem> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResModem> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResModem> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResModem>) super.load(ResModem.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResModem.class  , criteria ,conjuncationType) ;
	}
			


	

}
