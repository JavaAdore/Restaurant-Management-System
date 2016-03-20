package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDeliverCharges;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDeliverChargesDAO {


	public void delete(ResDeliverCharges resDeliverCharges) ;
	
	public ResDeliverCharges saveOrUpdate(ResDeliverCharges resDeliverCharges) ;

	public ResDeliverCharges load(Long id ) ;

	
	public List<ResDeliverCharges> loadAll() ;


	public List<ResDeliverCharges> loadByNamedQuery(String queryName) ;

	
	public List<ResDeliverCharges> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDeliverCharges> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
