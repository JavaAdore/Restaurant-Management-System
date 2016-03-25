package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderType;
import com.itigeeks.restaurant.dataaccess.dao.ResOrderTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResOrderTypeDAOImpl extends AbstractDAO implements ResOrderTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResOrderType resOrderType) 
	{
		super.delete(resOrderType);
	}
	
	public ResOrderType saveOrUpdate(ResOrderType resOrderType) 
	{
		return (ResOrderType) super.saveOrUpdate(resOrderType);
	}

	public ResOrderType load(Long id )
	{
		return (ResOrderType) super.get(ResOrderType.class , id);
	}

	
	public List<ResOrderType> loadAll()
	{
		return (List<ResOrderType>) super.loadAll(ResOrderType.class);
	}


	public List<ResOrderType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResOrderType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResOrderType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResOrderType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResOrderType> search( Map<String, Object> criteria )
	{
		return super.search( ResOrderType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResOrderType.class);
	}

	public List<ResOrderType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResOrderType.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResOrderType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResOrderType.class , startPage , pageSize);
	}

}
