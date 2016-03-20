package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrder;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderDAOImpl extends AbstractDAO implements ResOrderDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrder resOrder) 
	{
		super.delete(resOrder);
	}
	
	public ResOrder saveOrUpdate(ResOrder resOrder) 
	{
		return (ResOrder) super.saveOrUpdate(resOrder);
	}

	public ResOrder load(Long id )
	{
		return (ResOrder) super.get(ResOrder.class , id);
	}

	
	public List<ResOrder> loadAll()
	{
		return (List<ResOrder>) super.loadAll(ResOrder.class);
	}


	public List<ResOrder> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrder>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrder>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrder> search( Map<String, Object> criteria )
	{
		return super.search( ResOrder.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrder.class);
	}
}
