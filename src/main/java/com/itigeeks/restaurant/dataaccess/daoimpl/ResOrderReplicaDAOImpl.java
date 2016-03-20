package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderReplica;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderReplicaDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderReplicaDAOImpl extends AbstractDAO implements ResOrderReplicaDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderReplica resOrderReplica) 
	{
		super.delete(resOrderReplica);
	}
	
	public ResOrderReplica saveOrUpdate(ResOrderReplica resOrderReplica) 
	{
		return (ResOrderReplica) super.saveOrUpdate(resOrderReplica);
	}

	public ResOrderReplica load(Long id )
	{
		return (ResOrderReplica) super.get(ResOrderReplica.class , id);
	}

	
	public List<ResOrderReplica> loadAll()
	{
		return (List<ResOrderReplica>) super.loadAll(ResOrderReplica.class);
	}


	public List<ResOrderReplica> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderReplica>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderReplica> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderReplica>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderReplica> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderReplica.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderReplica.class);
	}
}
