package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;
import com.itigeeks.restaurant.dataaccess.dao.ResPromotionalOfferDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResPromotionalOfferDAOImpl extends AbstractDAO implements ResPromotionalOfferDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResPromotionalOffer resPromotionalOffer) 
	{
		super.delete(resPromotionalOffer);
	}
	
	public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer) 
	{
		return (ResPromotionalOffer) super.saveOrUpdate(resPromotionalOffer);
	}

	public ResPromotionalOffer load(Long id )
	{
		return (ResPromotionalOffer) super.get(ResPromotionalOffer.class , id);
	}

	
	public List<ResPromotionalOffer> loadAll()
	{
		return (List<ResPromotionalOffer>) super.loadAll(ResPromotionalOffer.class);
	}


	public List<ResPromotionalOffer> loadByNamedQuery(String queryName)
	{
		
		return (List<ResPromotionalOffer>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResPromotionalOffer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResPromotionalOffer>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResPromotionalOffer> search( Map<String, Object> criteria )
	{
		return super.search( ResPromotionalOffer.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResPromotionalOffer.class);
	}

	public List<ResPromotionalOffer> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResPromotionalOffer.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResPromotionalOffer> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromotionalOffer.class , startPage , pageSize);
	}

}
