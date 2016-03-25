package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResFlaggedOccassionTypeDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResFlaggedOccassionTypeDAOImpl extends AbstractDAO implements ResFlaggedOccassionTypeDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResFlaggedOccassionType resFlaggedOccassionType) 
	{
		super.delete(resFlaggedOccassionType);
	}
	
	public ResFlaggedOccassionType saveOrUpdate(ResFlaggedOccassionType resFlaggedOccassionType) 
	{
		return (ResFlaggedOccassionType) super.saveOrUpdate(resFlaggedOccassionType);
	}

	public ResFlaggedOccassionType load(Long id )
	{
		return (ResFlaggedOccassionType) super.get(ResFlaggedOccassionType.class , id);
	}

	
	public List<ResFlaggedOccassionType> loadAll()
	{
		return (List<ResFlaggedOccassionType>) super.loadAll(ResFlaggedOccassionType.class);
	}


	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName)
	{
		
		return (List<ResFlaggedOccassionType>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResFlaggedOccassionType> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResFlaggedOccassionType>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResFlaggedOccassionType.class);
	}

	

	public List<ResFlaggedOccassionType> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResFlaggedOccassionType.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResFlaggedOccassionType> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResFlaggedOccassionType> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResFlaggedOccassionType>) super.load(ResFlaggedOccassionType.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResFlaggedOccassionType> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResFlaggedOccassionType>) super.load(ResFlaggedOccassionType.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResFlaggedOccassionType.class  , criteria ,conjuncationType) ;
	}
			


	

}
