package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResVoucher;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResVoucherDAO {


	public void delete(ResVoucher resVoucher) ;
	
	public ResVoucher saveOrUpdate(ResVoucher resVoucher) ;

	public ResVoucher load(Long id ) ;

	
	public List<ResVoucher> loadAll() ;


	public List<ResVoucher> loadByNamedQuery(String queryName) ;

	
	public List<ResVoucher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResVoucher> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
