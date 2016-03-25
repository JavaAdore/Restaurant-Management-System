package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResSpecialInstructionsDAO {


	public void delete(ResSpecialInstructions resSpecialInstructions) ;
	
	public ResSpecialInstructions saveOrUpdate(ResSpecialInstructions resSpecialInstructions) ;

	public ResSpecialInstructions load(Long id ) ;

	public List<ResSpecialInstructions> loadAll() ;
	
	public List<ResSpecialInstructions> loadAll(Integer startPage , Integer pageSize ) ;

	public List<ResSpecialInstructions> loadByNamedQuery(String queryName) ;
	
	public List<ResSpecialInstructions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	public List<ResSpecialInstructions> load( Map<String, Object> criteria ) ;
	
	public List<ResSpecialInstructions> load(Map<String, Object> criteria,QueryConjunctionType queryConjunctionType);

	public List<ResSpecialInstructions> load( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;
	
	public List<ResSpecialInstructions> load( Map<String, Object> criteria , Integer startPage , Integer pageSize , QueryConjunctionType conjuncationType) ;

	public List<ResSpecialInstructions> load(Map<String, Object> criteria,Integer startPage, Integer pageSize, String sortField,Boolean ascending, QueryConjunctionType conjuncationType);
		
	
	public Integer countAll();

	public Integer getCount(Map<String, Object> criteria);
			
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType);
	


	
}
