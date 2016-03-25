package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResAdditionalCompanyDAO {


	public void delete(ResAdditionalCompany resAdditionalCompany) ;
	
	public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany) ;

	public ResAdditionalCompany load(Long id ) ;

	
	public List<ResAdditionalCompany> loadAll() ;


	public List<ResAdditionalCompany> loadByNamedQuery(String queryName) ;

	
	public List<ResAdditionalCompany> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResAdditionalCompany> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResAdditionalCompany> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResAdditionalCompany> loadAll(Integer startPage , Integer pageSize ) ;

}
