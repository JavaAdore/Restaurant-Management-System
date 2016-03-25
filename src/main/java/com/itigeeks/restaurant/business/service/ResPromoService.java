package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPromo;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPromoService {


	public void delete(ResPromo resPromo) ;
	
	public ResPromo saveOrUpdate(ResPromo resPromo) ;

	public ResPromo load(Long id ) ;

	
	public List<ResPromo> loadAll() ;


	public List<ResPromo> loadByNamedQuery(String queryName) ;

	
	public List<ResPromo> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPromo> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResPromo> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPromo> loadAll(Integer startPage , Integer pageSize ) ;

}