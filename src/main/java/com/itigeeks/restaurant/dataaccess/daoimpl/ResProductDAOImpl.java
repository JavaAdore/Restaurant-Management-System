package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResProduct;
import com.itigeeks.restaurant.dataaccess.dao.ResProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResProductDAOImpl extends AbstractDAO implements ResProductDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResProduct resProduct) 
	{
		super.delete(resProduct);
	}
	
	public ResProduct saveOrUpdate(ResProduct resProduct) 
	{
		return (ResProduct) super.saveOrUpdate(resProduct);
	}

	public ResProduct load(Long id )
	{
		return (ResProduct) super.get(ResProduct.class , id);
	}

	
	public List<ResProduct> loadAll()
	{
		return (List<ResProduct>) super.loadAll(ResProduct.class);
	}


	public List<ResProduct> loadByNamedQuery(String queryName)
	{
		
		return (List<ResProduct>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResProduct>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResProduct> search( Map<String, Object> criteria )
	{
		return super.search( ResProduct.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResProduct.class);
	}
}
