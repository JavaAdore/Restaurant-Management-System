package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;
import com.itigeeks.restaurant.dataaccess.dao.ResPrepLocationDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPrepLocationDAOImpl extends AbstractDAO implements ResPrepLocationDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPrepLocation resPrepLocation) 
	{
		super.delete(resPrepLocation);
	}
	
	public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation) 
	{
		return (ResPrepLocation) super.saveOrUpdate(resPrepLocation);
	}

	public ResPrepLocation load(Long id )
	{
		return (ResPrepLocation) super.get(ResPrepLocation.class , id);
	}

	
	public List<ResPrepLocation> loadAll()
	{
		return (List<ResPrepLocation>) super.loadAll(ResPrepLocation.class);
	}


	public List<ResPrepLocation> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPrepLocation>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPrepLocation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPrepLocation>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPrepLocation> search( Map<String, Object> criteria )
	{
		return super.search( ResPrepLocation.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPrepLocation.class);
	}
}
