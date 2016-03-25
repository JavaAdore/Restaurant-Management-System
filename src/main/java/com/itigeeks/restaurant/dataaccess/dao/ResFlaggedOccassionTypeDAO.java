package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResFlaggedOccassionTypeDAO {


	public void delete(ResFlaggedOccassionType resFlaggedOccassionType) ;
	
	public ResFlaggedOccassionType saveOrUpdate(ResFlaggedOccassionType resFlaggedOccassionType) ;

	public ResFlaggedOccassionType load(Long id ) ;

	
	public List<ResFlaggedOccassionType> loadAll() ;


	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName) ;

	
	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResFlaggedOccassionType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResFlaggedOccassionType> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResFlaggedOccassionType> loadAll(Integer startPage , Integer pageSize ) ;

}
