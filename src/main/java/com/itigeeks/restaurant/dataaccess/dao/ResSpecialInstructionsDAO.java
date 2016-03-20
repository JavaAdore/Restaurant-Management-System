package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResSpecialInstructions;

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


	public List<ResSpecialInstructions> loadByNamedQuery(String queryName) ;

	
	public List<ResSpecialInstructions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResSpecialInstructions> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
