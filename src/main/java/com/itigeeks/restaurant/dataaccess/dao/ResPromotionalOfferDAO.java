package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPromotionalOffer;

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


	public List<ResPromotionalOffer> loadByNamedQuery(String queryName) ;

	
	public List<ResPromotionalOffer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromotionalOffer> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResPromotionalOffer> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResPromotionalOffer> loadAll(Integer startPage , Integer pageSize ) ;

}
