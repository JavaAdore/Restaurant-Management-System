package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionProductDiscount;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionProductDiscountDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPromotionProductDiscountDAOImpl extends AbstractDAO implements ResPromotionProductDiscountDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPromotionProductDiscount resPromotionProductDiscount) 
	{
		super.delete(resPromotionProductDiscount);
	}
	
	public ResPromotionProductDiscount saveOrUpdate(ResPromotionProductDiscount resPromotionProductDiscount) 
	{
		return (ResPromotionProductDiscount) super.saveOrUpdate(resPromotionProductDiscount);
	}

	public ResPromotionProductDiscount load(Long id )
	{
		return (ResPromotionProductDiscount) super.get(ResPromotionProductDiscount.class , id);
	}

	
	public List<ResPromotionProductDiscount> loadAll()
	{
		return (List<ResPromotionProductDiscount>) super.loadAll(ResPromotionProductDiscount.class);
	}


	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPromotionProductDiscount>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionProductDiscount> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPromotionProductDiscount>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria )
	{
		return super.search( ResPromotionProductDiscount.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPromotionProductDiscount.class);
	}

	public List<ResPromotionProductDiscount> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPromotionProductDiscount.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPromotionProductDiscount> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromotionProductDiscount.class , startPage , pageSize);
	}

}
