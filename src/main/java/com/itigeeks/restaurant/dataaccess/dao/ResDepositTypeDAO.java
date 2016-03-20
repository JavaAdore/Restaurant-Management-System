package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResDepositType;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResDepositTypeDAO {


	public void delete(ResDepositType resDepositType) ;
	
	public ResDepositType saveOrUpdate(ResDepositType resDepositType) ;

	public ResDepositType load(Long id ) ;

	
	public List<ResDepositType> loadAll() ;


	public List<ResDepositType> loadByNamedQuery(String queryName) ;

	
	public List<ResDepositType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResDepositType> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
}
