package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResMessageStatusDAOImpl extends AbstractDAO implements ResMessageStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResMessageStatus resMessageStatus) 
	{
		super.delete(resMessageStatus);
	}
	
	public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus) 
	{
		return (ResMessageStatus) super.saveOrUpdate(resMessageStatus);
	}

	public ResMessageStatus load(Long id )
	{
		return (ResMessageStatus) super.get(ResMessageStatus.class , id);
	}

	
	public List<ResMessageStatus> loadAll()
	{
		return (List<ResMessageStatus>) super.loadAll(ResMessageStatus.class);
	}


	public List<ResMessageStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResMessageStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResMessageStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResMessageStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResMessageStatus> search( Map<String, Object> criteria )
	{
		return super.search( ResMessageStatus.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResMessageStatus.class);
	}

	public List<ResMessageStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResMessageStatus.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResMessageStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResMessageStatus.class , startPage , pageSize);
	}

}
