package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResConvertedToTakeAway;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResConvertedToTakeAwayDAO {


	public void delete(ResConvertedToTakeAway resConvertedToTakeAway) ;
	
	public ResConvertedToTakeAway saveOrUpdate(ResConvertedToTakeAway resConvertedToTakeAway) ;

	public ResConvertedToTakeAway load(Long id ) ;

	
	public List<ResConvertedToTakeAway> loadAll() ;


	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName) ;

	
	public List<ResConvertedToTakeAway> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResConvertedToTakeAway> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResConvertedToTakeAway> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResConvertedToTakeAway> loadAll(Integer startPage , Integer pageSize ) ;

}
