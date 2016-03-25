package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResUserType;
import com.itigeeks.restaurant.dataaccess.dao.ResUserTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResUserTypeDAOImpl extends AbstractDAO implements ResUserTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResUserType resUserType) 
	{
		super.delete(resUserType);
	}
	
	public ResUserType saveOrUpdate(ResUserType resUserType) 
	{
		return (ResUserType) super.saveOrUpdate(resUserType);
	}

	public ResUserType load(Long id )
	{
		return (ResUserType) super.get(ResUserType.class , id);
	}

	
	public List<ResUserType> loadAll()
	{
		return (List<ResUserType>) super.loadAll(ResUserType.class);
	}


	public List<ResUserType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResUserType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResUserType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResUserType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResUserType> search( Map<String, Object> criteria )
	{
		return super.search( ResUserType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResUserType.class);
	}

	public List<ResUserType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResUserType.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResUserType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResUserType.class , startPage , pageSize);
	}

}
