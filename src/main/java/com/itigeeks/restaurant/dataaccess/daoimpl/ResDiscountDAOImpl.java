package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscount;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDiscountDAOImpl extends AbstractDAO implements ResDiscountDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDiscount resDiscount) 
	{
		super.delete(resDiscount);
	}
	
	public ResDiscount saveOrUpdate(ResDiscount resDiscount) 
	{
		return (ResDiscount) super.saveOrUpdate(resDiscount);
	}

	public ResDiscount load(Long id )
	{
		return (ResDiscount) super.get(ResDiscount.class , id);
	}

	
	public List<ResDiscount> loadAll()
	{
		return (List<ResDiscount>) super.loadAll(ResDiscount.class);
	}


	public List<ResDiscount> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDiscount>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDiscount>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDiscount> search( Map<String, Object> criteria )
	{
		return super.search( ResDiscount.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDiscount.class);
	}

	public List<ResDiscount> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResDiscount.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResDiscount> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResDiscount.class , startPage , pageSize);
	}

}
