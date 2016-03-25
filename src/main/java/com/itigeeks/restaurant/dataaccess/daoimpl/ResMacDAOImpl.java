package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMac;
import com.itigeeks.restaurant.dataaccess.dao.ResMacDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResMacDAOImpl extends AbstractDAO implements ResMacDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResMac resMac) 
	{
		super.delete(resMac);
	}
	
	public ResMac saveOrUpdate(ResMac resMac) 
	{
		return (ResMac) super.saveOrUpdate(resMac);
	}

	public ResMac load(Long id )
	{
		return (ResMac) super.get(ResMac.class , id);
	}

	
	public List<ResMac> loadAll()
	{
		return (List<ResMac>) super.loadAll(ResMac.class);
	}


	public List<ResMac> loadByNamedQuery(String queryName)
	{
		
		return (List<ResMac>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResMac> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResMac>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMac> search( Map<String, Object> criteria )
	{
		return super.search( ResMac.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResMac.class);
	}

	public List<ResMac> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResMac.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResMac> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResMac.class , startPage , pageSize);
	}

}
