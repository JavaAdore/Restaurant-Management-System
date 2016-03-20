package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservation;
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
	
	
	public List<ResReservation> search( Map<String, Object> criteria )
	{
		return super.search( ResReservation.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservation.class);
	}
}
