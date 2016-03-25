package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;
import com.itigeeks.restaurant.common.enums.QueryConjunctionType;
import com.itigeeks.restaurant.dataaccess.dao.ResCustomerCommentDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResCustomerCommentDAOImpl extends AbstractDAO implements ResCustomerCommentDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResCustomerComment resCustomerComment) 
	{
		super.delete(resCustomerComment);
	}
	
	public ResCustomerComment saveOrUpdate(ResCustomerComment resCustomerComment) 
	{
		return (ResCustomerComment) super.saveOrUpdate(resCustomerComment);
	}

	public ResCustomerComment load(Long id )
	{
		return (ResCustomerComment) super.get(ResCustomerComment.class , id);
	}

	
	public List<ResCustomerComment> loadAll()
	{
		return (List<ResCustomerComment>) super.loadAll(ResCustomerComment.class);
	}


	public List<ResCustomerComment> loadByNamedQuery(String queryName)
	{
		
		return (List<ResCustomerComment>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResCustomerComment> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResCustomerComment>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	

	
	public Integer countAll()
	{
		return super.countAll(ResCustomerComment.class);
	}

	

	public List<ResCustomerComment> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCustomerComment.class , startPage , pageSize);
	}
	
	
	
	

	@Override
	public List<ResCustomerComment> load(Map<String, Object> criteria) {
		return this.load(criteria , QueryConjunctionType.AND);
	}

	@Override
	public List<ResCustomerComment> load(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
			
			return (List<ResCustomerComment>) super.load(ResCustomerComment.class , criteria ,  conjuncationType );
	}

	@Override
	public List<ResCustomerComment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,QueryConjunctionType conjuncationType) {
		
		return this.load( criteria,  startPage,  pageSize,null , null, conjuncationType);
	}
	

	@Override
	public List<ResCustomerComment> load(Map<String, Object> criteria, Integer startPage,Integer pageSize) {
			
		return this.load( criteria,  startPage,  pageSize,null , null, QueryConjunctionType.AND);

	}

	@Override
	public List<ResCustomerComment> load(Map<String, Object> criteria, Integer startPage, Integer pageSize,String sortField, Boolean ascending,QueryConjunctionType conjuncationType) {
			
		return (List<ResCustomerComment>) super.load(ResCustomerComment.class , criteria , startPage , pageSize ,  sortField , ascending ,  conjuncationType );
	}

	
	@Override
	public Integer getCount(Map<String, Object> criteria) {
			return this.getCount(criteria ,QueryConjunctionType.AND );
	}

	@Override
	public Integer getCount(Map<String, Object> criteria,QueryConjunctionType conjuncationType) {
		return super.getCount(ResCustomerComment.class  , criteria ,conjuncationType) ;
	}
			


	

}
