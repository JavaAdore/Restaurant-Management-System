package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPromotionalOfferDAO {


	public void delete(ResPromotionalOffer resPromotionalOffer) ;
	
	public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer) ;

	public ResPromotionalOffer load(Long id ) ;

	public List<ResPromotionalOffer> loadAll() ;
	
	public List<ResPromotionalOffer> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResPromotionalOffer> loadByNamedQuery(String queryName) ;
	
	public List<ResPromotionalOffer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResPromotionalOffer> load( Map<String, Object> criteria ) ;
	
	public List<ResPromotionalOffer> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResPromotionalOffer> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResPromotionalOffer> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResPromotionalOffer> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
