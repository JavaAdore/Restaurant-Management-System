package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPromotionalOfferService {


	public void delete(ResPromotionalOffer resPromotionalOffer) ;
	
	public ResPromotionalOffer saveOrUpdate(ResPromotionalOffer resPromotionalOffer) ;

	public ResPromotionalOffer load(Long id ) ;

	
	public List<ResPromotionalOffer> loadAll() ;


	public List<ResPromotionalOffer> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionalOffer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionalOffer> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}