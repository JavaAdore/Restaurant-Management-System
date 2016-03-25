package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationTime;
import com.itigeeks.restaurant.dataaccess.dao.ResReservationTimeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResReservationTimeDAOImpl extends AbstractDAO implements ResReservationTimeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResReservationTime resReservationTime) 
	{
		super.delete(resReservationTime);
	}
	
	public ResReservationTime saveOrUpdate(ResReservationTime resReservationTime) 
	{
		return (ResReservationTime) super.saveOrUpdate(resReservationTime);
	}

	public ResReservationTime load(Long id )
	{
		return (ResReservationTime) super.get(ResReservationTime.class , id);
	}

	
	public List<ResReservationTime> loadAll()
	{
		return (List<ResReservationTime>) super.loadAll(ResReservationTime.class);
	}


	public List<ResReservationTime> loadByNamedQuery(String queryName)
	{
		
		return (List<ResReservationTime>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResReservationTime> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResReservationTime>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResReservationTime> search( Map<String, Object> criteria )
	{
		return super.search( ResReservationTime.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservationTime.class);
	}

	public List<ResReservationTime> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResReservationTime.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResReservationTime> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservationTime.class , startPage , pageSize);
	}

}
