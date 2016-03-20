package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCardType;
import com.itigeeks.restaurant.dataaccess.dao.ResCardTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCardTypeDAOImpl extends AbstractDAO implements ResCardTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCardType resCardType) 
	{
		super.delete(resCardType);
	}
	
	public ResCardType saveOrUpdate(ResCardType resCardType) 
	{
		return (ResCardType) super.saveOrUpdate(resCardType);
	}

	public ResCardType load(Long id )
	{
		return (ResCardType) super.get(ResCardType.class , id);
	}

	
	public List<ResCardType> loadAll()
	{
		return (List<ResCardType>) super.loadAll(ResCardType.class);
	}


	public List<ResCardType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCardType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCardType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCardType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResCardType> search( Map<String, Object> criteria )
	{
		return super.search( ResCardType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCardType.class);
	}
}
