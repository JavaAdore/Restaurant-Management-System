package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlockCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPrintBlockCategoryService {


	public void delete(ResPrintBlockCategory resPrintBlockCategory) ;
	
	public ResPrintBlockCategory saveOrUpdate(ResPrintBlockCategory resPrintBlockCategory) ;

	public ResPrintBlockCategory load(Long id ) ;

	
	public List<ResPrintBlockCategory> loadAll() ;


	public List<ResPrintBlockCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResPrintBlockCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrintBlockCategory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}