package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResAdditionalCompany;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResAdditionalCompanyService {


	public void delete(ResAdditionalCompany resAdditionalCompany) ;
	
	public ResAdditionalCompany saveOrUpdate(ResAdditionalCompany resAdditionalCompany) ;

	public ResAdditionalCompany load(Long id ) ;

	
	public List<ResAdditionalCompany> loadAll() ;


	public List<ResAdditionalCompany> loadByNamedQuery(String queryName) ;

	
	public List<ResAdditionalCompany> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResAdditionalCompany> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}