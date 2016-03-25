package com.itigeeks.restaurant.dataaccess.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResOrderReplica;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Repository
public interface ResOrderReplicaDAO {


	public void delete(ResOrderReplica resOrderReplica) ;
	
	public ResOrderReplica saveOrUpdate(ResOrderReplica resOrderReplica) ;

	public ResOrderReplica load(Long id ) ;

	
	public List<ResOrderReplica> loadAll() ;


	public List<ResOrderReplica> loadByNamedQuery(String queryName) ;

	
	public List<ResOrderReplica> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResOrderReplica> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResOrderReplica> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) ;

	public List<ResOrderReplica> loadAll(Integer startPage , Integer pageSize ) ;

}
