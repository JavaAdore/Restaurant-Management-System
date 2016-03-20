package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResAdditionalCompanyCategoryDAO {


	public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory) ;
	
	public ResAdditionalCompanyCategory saveOrUpdate(ResAdditionalCompanyCategory resAdditionalCompanyCategory) ;

	public ResAdditionalCompanyCategory load(Long id ) ;

	
	public List<ResAdditionalCompanyCategory> loadAll() ;


	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResAdditionalCompanyCategory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
