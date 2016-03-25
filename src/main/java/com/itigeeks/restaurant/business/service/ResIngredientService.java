package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResIngredient;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResIngredientService {


	public void delete(ResIngredient resIngredient) ;
	
	public ResIngredient saveOrUpdate(ResIngredient resIngredient) ;

	public ResIngredient load(Long id ) ;

	
	public List<ResIngredient> loadAll() ;


	public List<ResIngredient> loadByNamedQuery(String queryName) ;

	
	public List<ResIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResIngredient> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResIngredient> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResIngredient> loadAll(Integer startPage , Integer pageSize ) ;

}