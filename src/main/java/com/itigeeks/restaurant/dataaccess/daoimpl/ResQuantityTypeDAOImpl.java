package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityType;
import com.itigeeks.restaurant.dataaccess.dao.ResQuantityTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResQuantityTypeDAOImpl extends AbstractDAO implements ResQuantityTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResQuantityType resQuantityType) 
	{
		super.delete(resQuantityType);
	}
	
	public ResQuantityType saveOrUpdate(ResQuantityType resQuantityType) 
	{
		return (ResQuantityType) super.saveOrUpdate(resQuantityType);
	}

	public ResQuantityType load(Long id )
	{
		return (ResQuantityType) super.get(ResQuantityType.class , id);
	}

	
	public List<ResQuantityType> loadAll()
	{
		return (List<ResQuantityType>) super.loadAll(ResQuantityType.class);
	}


	public List<ResQuantityType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResQuantityType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResQuantityType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResQuantityType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResQuantityType> search( Map<String, Object> criteria )
	{
		return super.search( ResQuantityType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResQuantityType.class);
	}

	public List<ResQuantityType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResQuantityType.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResQuantityType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResQuantityType.class , startPage , pageSize);
	}

}
