package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
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
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResPromotionalOffer.class);
	}

	

	public List<ResPromotionalOffer> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResPromotionalOffer.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResPromotionalOffer> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResPromotionalOffer> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResPromotionalOffer>) super.load(ResPromotionalOffer.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResPromotionalOffer> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResPromotionalOffer> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResPromotionalOffer> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResPromotionalOffer>) super.load(ResPromotionalOffer.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResPromotionalOffer.class  , criteria ,conjuncationType) ;
	}
			


	

}
