package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinter;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPrinterDAO {


	public void delete(ResPrinter resPrinter) ;
	
	public ResPrinter saveOrUpdate(ResPrinter resPrinter) ;

	public ResPrinter load(Long id ) ;

	
	public List<ResPrinter> loadAll() ;


	public List<ResPrinter> loadByNamedQuery(String queryName) ;

	
	public List<ResPrinter> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrinter> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
