package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationStatusDAOImpl extends AbstractDAO implements ResReservationStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservationStatus resReservationStatus) 
	{
		super.delete(resReservationStatus);
	}
	
	public ResReservationStatus saveOrUpdate(ResReservationStatus resReservationStatus) 
	{
		return (ResReservationStatus) super.saveOrUpdate(resReservationStatus);
	}

	public ResReservationStatus load(Long id )
	{
		return (ResReservationStatus) super.get(ResReservationStatus.class , id);
	}

	
	public List<ResReservationStatus> loadAll()
	{
		return (List<ResReservationStatus>) super.loadAll(ResReservationStatus.class);
	}


	public List<ResReservationStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservationStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservationStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReservationStatus> search( Map<String, Object> criteria )
	{
		return super.search( ResReservationStatus.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservationStatus.class);
	}

	public List<ResReservationStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResReservationStatus.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResReservationStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservationStatus.class , startPage , pageSize);
	}

}
