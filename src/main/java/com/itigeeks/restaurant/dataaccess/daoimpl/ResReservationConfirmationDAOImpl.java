package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationConfirmation;
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
	
	
	public List<ResReservationConfirmation> search( Map<String, Object> criteria )
	{
		return super.search( ResReservationConfirmation.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservationConfirmation.class);
	}
}
