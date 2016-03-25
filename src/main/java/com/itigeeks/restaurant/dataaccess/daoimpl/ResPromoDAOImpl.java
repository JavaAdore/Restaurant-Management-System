package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromo;
import com.itigeeks.restaurant.dataaccess.dao.ResPromoDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPromoDAOImpl extends AbstractDAO implements ResPromoDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPromo resPromo) 
	{
		super.delete(resPromo);
	}
	
	public ResPromo saveOrUpdate(ResPromo resPromo) 
	{
		return (ResPromo) super.saveOrUpdate(resPromo);
	}

	public ResPromo load(Long id )
	{
		return (ResPromo) super.get(ResPromo.class , id);
	}

	
	public List<ResPromo> loadAll()
	{
		return (List<ResPromo>) super.loadAll(ResPromo.class);
	}


	public List<ResPromo> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPromo>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPromo> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPromo>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromo> search( Map<String, Object> criteria )
	{
		return super.search( ResPromo.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPromo.class);
	}

	public List<ResPromo> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPromo.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPromo> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromo.class , startPage , pageSize);
	}

}
