package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrepLocation;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPrepLocationDAO {


	public void delete(ResPrepLocation resPrepLocation) ;
	
	public ResPrepLocation saveOrUpdate(ResPrepLocation resPrepLocation) ;

	public ResPrepLocation load(Long id ) ;

	
	public List<ResPrepLocation> loadAll() ;


	public List<ResPrepLocation> loadByNamedQuery(String queryName) ;

	
	public List<ResPrepLocation> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrepLocation> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
