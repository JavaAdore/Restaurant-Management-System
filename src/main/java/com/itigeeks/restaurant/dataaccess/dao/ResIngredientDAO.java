package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResIngredient;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResIngredientDAO {


	public void delete(ResIngredient resIngredient) ;
	
	public ResIngredient saveOrUpdate(ResIngredient resIngredient) ;

	public ResIngredient load(Long id ) ;

	
	public List<ResIngredient> loadAll() ;


	public List<ResIngredient> loadByNamedQuery(String queryName) ;

	
	public List<ResIngredient> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResIngredient> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResIngredient> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResIngredient> loadAll(Integer startPage , Integer pageSize ) ;

}
