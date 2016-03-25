package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucherExclusions;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResVoucherExclusionsDAO {


	public void delete(ResVoucherExclusions resVoucherExclusions) ;
	
	public ResVoucherExclusions saveOrUpdate(ResVoucherExclusions resVoucherExclusions) ;

	public ResVoucherExclusions load(Long id ) ;

	
	public List<ResVoucherExclusions> loadAll() ;


	public List<ResVoucherExclusions> loadByNamedQuery(String queryName) ;

	
	public List<ResVoucherExclusions> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResVoucherExclusions> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResVoucherExclusions> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResVoucherExclusions> loadAll(Integer startPage , Integer pageSize ) ;

}
