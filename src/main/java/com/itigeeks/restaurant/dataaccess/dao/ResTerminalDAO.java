package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTerminal;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResTerminalDAO {


	public void delete(ResTerminal resTerminal) ;
	
	public ResTerminal saveOrUpdate(ResTerminal resTerminal) ;

	public ResTerminal load(Long id ) ;

	
	public List<ResTerminal> loadAll() ;


	public List<ResTerminal> loadByNamedQuery(String queryName) ;

	
	public List<ResTerminal> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResTerminal> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResTerminal> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResTerminal> loadAll(Integer startPage , Integer pageSize ) ;

}
