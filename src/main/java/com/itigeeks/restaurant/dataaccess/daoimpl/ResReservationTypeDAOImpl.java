package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationTypeDAOImpl extends AbstractDAO implements ResReservationTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservationType resReservationType) 
	{
		super.delete(resReservationType);
	}
	
	public ResReservationType saveOrUpdate(ResReservationType resReservationType) 
	{
		return (ResReservationType) super.saveOrUpdate(resReservationType);
	}

	public ResReservationType load(Long id )
	{
		return (ResReservationType) super.get(ResReservationType.class , id);
	}

	
	public List<ResReservationType> loadAll()
	{
		return (List<ResReservationType>) super.loadAll(ResReservationType.class);
	}


	public List<ResReservationType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservationType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservationType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResReservationType.class);
	}

	

	public List<ResReservationType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservationType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResReservationType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResReservationType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResReservationType>) super.load(ResReservationType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResReservationType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResReservationType>) super.load(ResReservationType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResReservationType.class  , criteria ,conjuncationType) ;
	}
			


	

}
