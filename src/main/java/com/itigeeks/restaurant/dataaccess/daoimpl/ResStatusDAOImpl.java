package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResStatusDAOImpl extends AbstractDAO implements ResStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResStatus resStatus) 
	{
		super.delete(resStatus);
	}
	
	public ResStatus saveOrUpdate(ResStatus resStatus) 
	{
		return (ResStatus) super.saveOrUpdate(resStatus);
	}

	public ResStatus load(Long id )
	{
		return (ResStatus) super.get(ResStatus.class , id);
	}

	
	public List<ResStatus> loadAll()
	{
		return (List<ResStatus>) super.loadAll(ResStatus.class);
	}


	public List<ResStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResStatus> search( Map<String, Object> criteria )
	{
		return super.search( ResStatus.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResStatus.class);
	}
}
