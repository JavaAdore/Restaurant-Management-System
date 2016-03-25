package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationDAOImpl extends AbstractDAO implements ResReservationDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservation resReservation) 
	{
		super.delete(resReservation);
	}
	
	public ResReservation saveOrUpdate(ResReservation resReservation) 
	{
		return (ResReservation) super.saveOrUpdate(resReservation);
	}

	public ResReservation load(Long id )
	{
		return (ResReservation) super.get(ResReservation.class , id);
	}

	
	public List<ResReservation> loadAll()
	{
		return (List<ResReservation>) super.loadAll(ResReservation.class);
	}


	public List<ResReservation> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservation>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservation>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResReservation.class);
	}

	

	public List<ResReservation> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservation.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResReservation> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResReservation> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResReservation>) super.load(ResReservation.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResReservation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResReservation> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResReservation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResReservation>) super.load(ResReservation.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResReservation.class  , criteria ,conjuncationType) ;
	}
			


	

}
