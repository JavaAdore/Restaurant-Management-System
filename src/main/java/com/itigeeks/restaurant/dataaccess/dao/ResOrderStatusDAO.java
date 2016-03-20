package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderStatus;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderStatusDAO {


	public void delete(ResOrderStatus resOrderStatus) ;
	
	public ResOrderStatus saveOrUpdate(ResOrderStatus resOrderStatus) ;

	public ResOrderStatus load(Long id ) ;

	
	public List<ResOrderStatus> loadAll() ;


	public List<ResOrderStatus> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderStatus> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
