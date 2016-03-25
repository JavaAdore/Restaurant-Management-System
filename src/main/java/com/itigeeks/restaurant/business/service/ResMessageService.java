package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResMessage;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResMessageService {


	public void delete(ResMessage resMessage) ;
	
	public ResMessage saveOrUpdate(ResMessage resMessage) ;

	public ResMessage load(Long id ) ;

	
	public List<ResMessage> loadAll() ;


	public List<ResMessage> loadByNamedQuery(String queryName) ;

	
	public List<ResMessage> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResMessage> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResMessage> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResMessage> loadAll(Integer startPage , Integer pageSize ) ;

}