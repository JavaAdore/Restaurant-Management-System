package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResCustomerCommentDAO {


	public void delete(ResCustomerComment resCustomerComment) ;
	
	public ResCustomerComment saveOrUpdate(ResCustomerComment resCustomerComment) ;

	public ResCustomerComment load(Long id ) ;

	
	public List<ResCustomerComment> loadAll() ;


	public List<ResCustomerComment> loadByNamedQuery(String queryName) ;

	
	public List<ResCustomerComment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResCustomerComment> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
