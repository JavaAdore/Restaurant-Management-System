package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResModem;
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
	
	
	public List<ResModem> search( Map<String, Object> criteria )
	{
		return super.search( ResModem.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResModem.class);
	}

	public List<ResModem> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResModem.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResModem> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResModem.class , startPage , pageSize);
	}

}
