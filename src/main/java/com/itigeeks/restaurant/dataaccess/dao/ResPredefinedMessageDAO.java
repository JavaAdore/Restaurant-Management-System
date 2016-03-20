package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPredefinedMessage;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPredefinedMessageDAO {


	public void delete(ResPredefinedMessage resPredefinedMessage) ;
	
	public ResPredefinedMessage saveOrUpdate(ResPredefinedMessage resPredefinedMessage) ;

	public ResPredefinedMessage load(Long id ) ;

	
	public List<ResPredefinedMessage> loadAll() ;


	public List<ResPredefinedMessage> loadByNamedQuery(String queryName) ;

	
	public List<ResPredefinedMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPredefinedMessage> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
