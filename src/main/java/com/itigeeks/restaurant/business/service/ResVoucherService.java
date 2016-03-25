package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResVoucher;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResVoucherService {


	public void delete(ResVoucher resVoucher) ;
	
	public ResVoucher saveOrUpdate(ResVoucher resVoucher) ;

	public ResVoucher load(Long id ) ;

	
	public List<ResVoucher> loadAll() ;


	public List<ResVoucher> loadByNamedQuery(String queryName) ;

	
	public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResVoucher> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResVoucher> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResVoucher> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResVoucher> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResVoucher> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}