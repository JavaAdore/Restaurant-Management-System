package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationConfirmationDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationConfirmationDAOImpl extends AbstractDAO implements ResReservationConfirmationDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservationConfirmation resReservationConfirmation) 
	{
		super.delete(resReservationConfirmation);
	}
	
	public ResReservationConfirmation saveOrUpdate(ResReservationConfirmation resReservationConfirmation) 
	{
		return (ResReservationConfirmation) super.saveOrUpdate(resReservationConfirmation);
	}

	public ResReservationConfirmation load(Long id )
	{
		return (ResReservationConfirmation) super.get(ResReservationConfirmation.class , id);
	}

	
	public List<ResReservationConfirmation> loadAll()
	{
		return (List<ResReservationConfirmation>) super.loadAll(ResReservationConfirmation.class);
	}


	public List<ResReservationConfirmation> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservationConfirmation>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationConfirmation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservationConfirmation>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResReservationConfirmation.class);
	}

	

	public List<ResReservationConfirmation> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservationConfirmation.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResReservationConfirmation> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResReservationConfirmation> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResReservationConfirmation>) super.load(ResReservationConfirmation.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResReservationConfirmation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResReservationConfirmation> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResReservationConfirmation> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResReservationConfirmation>) super.load(ResReservationConfirmation.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResReservationConfirmation.class  , criteria ,conjuncationType) ;
	}
			


	

}
