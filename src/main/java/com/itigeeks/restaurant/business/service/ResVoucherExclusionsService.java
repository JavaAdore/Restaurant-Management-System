package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResVoucherExclusionsService {


	public void delete(ResVoucherExclusions resVoucherExclusions) ;
	
	public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions) ;

	public ResVoucherExclusions load(Long id ) ;

	
	public List<ResVoucherExclusions> loadAll() ;


	public List<ResVoucherExclusions> loadByNamedQuery(String queryName) ;

	
	public List<ResVoucherExclusions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResVoucherExclusions> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}