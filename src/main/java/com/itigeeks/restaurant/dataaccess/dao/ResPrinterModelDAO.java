package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResPrinterModel;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResPrinterModelDAO {


	public void delete(ResPrinterModel resPrinterModel) ;
	
	public ResPrinterModel saveOrUpdate(ResPrinterModel resPrinterModel) ;

	public ResPrinterModel load(Long id ) ;

	
	public List<ResPrinterModel> loadAll() ;


	public List<ResPrinterModel> loadByNamedQuery(String queryName) ;

	
	public List<ResPrinterModel> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrinterModel> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResPrinterModel> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResPrinterModel> loadAll(Integer startPage , Integer pageSize ) ;

}
