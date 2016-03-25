package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCategoryOrderCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCategoryOrderCategoryDAO {


	public void delete(ResCategoryOrderCategory resCategoryOrderCategory) ;
	
	public ResCategoryOrderCategory saveOrUpdate(ResCategoryOrderCategory resCategoryOrderCategory) ;

	public ResCategoryOrderCategory load(Long id ) ;

	
	public List<ResCategoryOrderCategory> loadAll() ;


	public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResCategoryOrderCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCategoryOrderCategory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResCategoryOrderCategory> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResCategoryOrderCategory> loadAll(Integer startPage , Integer pageSize ) ;

}
