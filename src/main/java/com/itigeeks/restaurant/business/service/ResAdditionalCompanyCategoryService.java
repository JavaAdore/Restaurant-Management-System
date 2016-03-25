package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompanyCategory;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResAdditionalCompanyCategoryService {


	public void delete(ResAdditionalCompanyCategory resAdditionalCompanyCategory) ;
	
	public ResAdditionalCompanyCategory saveOrUpdate(ResAdditionalCompanyCategory resAdditionalCompanyCategory) ;

	public ResAdditionalCompanyCategory load(Long id ) ;

	
	public List<ResAdditionalCompanyCategory> loadAll() ;


	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName) ;

	
	public List<ResAdditionalCompanyCategory> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResAdditionalCompanyCategory> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResAdditionalCompanyCategory> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResAdditionalCompanyCategory> loadAll(Integer startPage , Integer pageSize ) ;

}