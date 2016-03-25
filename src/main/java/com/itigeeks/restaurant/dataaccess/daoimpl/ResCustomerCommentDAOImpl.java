package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResCustomerComment;
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
	
	
	public List<ResCustomerComment> search( Map<String, Object> criteria )
	{
		return super.search( ResCustomerComment.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResCustomerComment.class);
	}

	public List<ResCustomerComment> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResCustomerComment.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResCustomerComment> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResCustomerComment.class , startPage , pageSize);
	}

}
