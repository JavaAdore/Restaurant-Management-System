package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDiscountProduct;
import com.itigeeks.restaurant.dataaccess.dao.ResDiscountProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResDiscountProductDAOImpl extends AbstractDAO implements ResDiscountProductDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResDiscountProduct resDiscountProduct) 
	{
		super.delete(resDiscountProduct);
	}
	
	public ResDiscountProduct saveOrUpdate(ResDiscountProduct resDiscountProduct) 
	{
		return (ResDiscountProduct) super.saveOrUpdate(resDiscountProduct);
	}

	public ResDiscountProduct load(Long id )
	{
		return (ResDiscountProduct) super.get(ResDiscountProduct.class , id);
	}

	
	public List<ResDiscountProduct> loadAll()
	{
		return (List<ResDiscountProduct>) super.loadAll(ResDiscountProduct.class);
	}


	public List<ResDiscountProduct> loadByNamedQuery(String queryName)
	{
		
		return (List<ResDiscountProduct>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResDiscountProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResDiscountProduct>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResDiscountProduct> search( Map<String, Object> criteria )
	{
		return super.search( ResDiscountProduct.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResDiscountProduct.class);
	}
}
