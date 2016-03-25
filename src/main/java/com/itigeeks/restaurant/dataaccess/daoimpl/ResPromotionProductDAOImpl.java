package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProduct;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPromotionProductDAOImpl extends AbstractDAO implements ResPromotionProductDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPromotionProduct resPromotionProduct) 
	{
		super.delete(resPromotionProduct);
	}
	
	public ResPromotionProduct saveOrUpdate(ResPromotionProduct resPromotionProduct) 
	{
		return (ResPromotionProduct) super.saveOrUpdate(resPromotionProduct);
	}

	public ResPromotionProduct load(Long id )
	{
		return (ResPromotionProduct) super.get(ResPromotionProduct.class , id);
	}

	
	public List<ResPromotionProduct> loadAll()
	{
		return (List<ResPromotionProduct>) super.loadAll(ResPromotionProduct.class);
	}


	public List<ResPromotionProduct> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPromotionProduct>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionProduct> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPromotionProduct>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionProduct> search( Map<String, Object> criteria )
	{
		return super.search( ResPromotionProduct.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPromotionProduct.class);
	}

	public List<ResPromotionProduct> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPromotionProduct.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPromotionProduct> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromotionProduct.class , startPage , pageSize);
	}

}
