package com.itigeeks.restaurant.business.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.itigeeks.restaurant.common.entity.schema.ResPrintBlock;

/**
 *
 * @author  ITI GEEKS
 *
 */

@Service
public interface ResPrintBlockService {


	public void delete(ResPrintBlock resPrintBlock) ;
	
	public ResPrintBlock saveOrUpdate(ResPrintBlock resPrintBlock) ;

	public ResPrintBlock load(Long id ) ;

	
	public List<ResPrintBlock> loadAll() ;


	public List<ResPrintBlock> loadByNamedQuery(String queryName) ;

	
	public List<ResPrintBlock> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;
	
	
	public List<ResPrintBlock> search( Map<String, Object> criteria ) ;

	
	public Integer countAll();
	
	public List<ResPrintBlock> search( Map<String, Object> criteria , Integer startPage , Integer pageSize ) ;

	public List<ResPrintBlock> loadAll(Integer startPage , Integer pageSize ) ;

}