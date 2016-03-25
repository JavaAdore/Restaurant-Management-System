package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResProductIngredient;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResProductIngredientService {


	public void delete(ResProductIngredient resProductIngredient) ;
	
	public ResProductIngredient saveOrUpdate(ResProductIngredient resProductIngredient) ;

	public ResProductIngredient load(Long id ) ;

	
	public List<ResProductIngredient> loadAll() ;


	public List<ResProductIngredient> loadByNamedQuery(String queryName) ;

	
	public List<ResProductIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResProductIngredient> load( Map<String, Object> criteria ) ;

	
	public Integer countAll();

				
	public List<ResProductIngredient> loadAll(Integer startPage , Integer pageSize ) ;
	
	public List<ResProductIngredient> load( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;
	
	public List<ResProductIngredient> loadWithAllCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProductIngredient> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize  ) ;
	
	public List<ResProductIngredient> loadWithAllCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;

	public List<ResProductIngredient> loadWithAnyCriteria( Map<String, Object> criteria  ) ;
	
	public List<ResProductIngredient> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResProductIngredient> loadWithAnyCriteria( Map<String, Object> criteria , Integer startPage , Integer pageSize , String sortField, Boolean ascending ) ;
	
	
	public Integer getCount( Map<String, Object> criteria  ) ;

	public Integer getCountOfAllCriteria( Map<String, Object> criteria  ) ;

	public Integer getCountOfWithAnyCriteria( Map<String, Object> criteria  ) ;




}