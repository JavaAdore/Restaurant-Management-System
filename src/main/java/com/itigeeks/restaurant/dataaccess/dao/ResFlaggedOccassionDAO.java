package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResFlaggedOccassionDAO {


	public void delete(ResFlaggedOccassion resFlaggedOccassion) ;
	
	public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion) ;

	public ResFlaggedOccassion load(Long id ) ;

	
	public List<ResFlaggedOccassion> loadAll() ;


	public List<ResFlaggedOccassion> loadByNamedQuery(String queryName) ;

	
	public List<ResFlaggedOccassion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResFlaggedOccassion> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResFlaggedOccassion> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResFlaggedOccassion> loadAll(Integer startPage , Integer pageSize ) ;

}
