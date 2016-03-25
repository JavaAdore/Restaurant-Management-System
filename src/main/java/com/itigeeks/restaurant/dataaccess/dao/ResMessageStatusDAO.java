package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResMessageStatusDAO {


	public void delete(ResMessageStatus resMessageStatus) ;
	
	public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus) ;

	public ResMessageStatus load(Long id ) ;

	
	public List<ResMessageStatus> loadAll() ;


	public List<ResMessageStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResMessageStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMessageStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResMessageStatus> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResMessageStatus> loadAll(Integer startPage , Integer pageSize ) ;

}
