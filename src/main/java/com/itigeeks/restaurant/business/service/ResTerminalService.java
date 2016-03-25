package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResTerminal;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResTerminalService {


	public void delete(ResTerminal resTerminal) ;
	
	public ResTerminal saveOrUpdate(ResTerminal resTerminal) ;

	public ResTerminal load(Long id ) ;

	
	public List<ResTerminal> loadAll() ;


	public List<ResTerminal> loadByNamedQuery(String queryName) ;

	
	public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResTerminal> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResTerminal> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResTerminal> loadAll(Integer startPage , Integer pageSize ) ;

}