package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResQuantityTypeConversion;
import com.itigeeks.restaurant.dataaccess.dao.ResQuantityTypeConversionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResQuantityTypeConversionDAOImpl extends AbstractDAO implements ResQuantityTypeConversionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResQuantityTypeConversion resQuantityTypeConversion) 
	{
		super.delete(resQuantityTypeConversion);
	}
	
	public ResQuantityTypeConversion saveOrUpdate(ResQuantityTypeConversion resQuantityTypeConversion) 
	{
		return (ResQuantityTypeConversion) super.saveOrUpdate(resQuantityTypeConversion);
	}

	public ResQuantityTypeConversion load(Long id )
	{
		return (ResQuantityTypeConversion) super.get(ResQuantityTypeConversion.class , id);
	}

	
	public List<ResQuantityTypeConversion> loadAll()
	{
		return (List<ResQuantityTypeConversion>) super.loadAll(ResQuantityTypeConversion.class);
	}


	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName)
	{
		
		return (List<ResQuantityTypeConversion>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResQuantityTypeConversion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResQuantityTypeConversion>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResQuantityTypeConversion> search( Map<String, Object> criteria )
	{
		return super.search( ResQuantityTypeConversion.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResQuantityTypeConversion.class);
	}
}
