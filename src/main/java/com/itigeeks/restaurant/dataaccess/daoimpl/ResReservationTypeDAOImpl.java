package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResReservationType;
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
	
	
	public List<ResReservationType> search( Map<String, Object> criteria )
	{
		return super.search( ResReservationType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResReservationType.class);
	}

	public List<ResReservationType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResReservationType.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResReservationType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResReservationType.class , startPage , pageSize);
	}

}
