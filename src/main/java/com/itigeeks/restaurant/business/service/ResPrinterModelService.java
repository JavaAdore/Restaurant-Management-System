package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPrinterModelService {


	public void delete(ResPrinterModel resPrinterModel) ;
	
	public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel) ;

	public ResPrinterModel load(Long id ) ;

	
	public List<ResPrinterModel> loadAll() ;


	public List<ResPrinterModel> loadByNamedQuery(String queryName) ;

	
	public List<ResPrinterModel> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrinterModel> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResPrinterModel> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResPrinterModel> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResPrinterModel> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPrinterModel> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}