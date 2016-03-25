package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResMessageStatus;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResMessageStatusDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResMessageStatusDAOImpl extends AbstractDAO implements ResMessageStatusDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResMessageStatus resMessageStatus) 
	{
		super.delete(resMessageStatus);
	}
	
	public ResMessageStatus saveOrUpdate(ResMessageStatus resMessageStatus) 
	{
		return (ResMessageStatus) super.saveOrUpdate(resMessageStatus);
	}

	public ResMessageStatus load(Long id )
	{
		return (ResMessageStatus) super.get(ResMessageStatus.class , id);
	}

	
	public List<ResMessageStatus> loadAll()
	{
		return (List<ResMessageStatus>) super.loadAll(ResMessageStatus.class);
	}


	public List<ResMessageStatus> loadByNamedQuery(String queryName)
	{
		
		return (List<ResMessageStatus>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResMessageStatus> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResMessageStatus>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResMessageStatus.class);
	}

	

	public List<ResMessageStatus> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResMessageStatus.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResMessageStatus> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResMessageStatus> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResMessageStatus>) super.load(ResMessageStatus.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResMessageStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResMessageStatus> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResMessageStatus> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResMessageStatus>) super.load(ResMessageStatus.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResMessageStatus.class  , criteria ,conjuncationType) ;
	}
			


	

}
