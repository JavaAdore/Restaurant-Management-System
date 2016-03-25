package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassion;
import com.itigeeks.restaurant.dataaccess.dao.ResFlaggedOccassionDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResFlaggedOccassionDAOImpl extends AbstractDAO implements ResFlaggedOccassionDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResFlaggedOccassion resFlaggedOccassion) 
	{
		super.delete(resFlaggedOccassion);
	}
	
	public ResFlaggedOccassion saveOrUpdate(ResFlaggedOccassion resFlaggedOccassion) 
	{
		return (ResFlaggedOccassion) super.saveOrUpdate(resFlaggedOccassion);
	}

	public ResFlaggedOccassion load(Long id )
	{
		return (ResFlaggedOccassion) super.get(ResFlaggedOccassion.class , id);
	}

	
	public List<ResFlaggedOccassion> loadAll()
	{
		return (List<ResFlaggedOccassion>) super.loadAll(ResFlaggedOccassion.class);
	}


	public List<ResFlaggedOccassion> loadByNamedQuery(String queryName)
	{
		
		return (List<ResFlaggedOccassion>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResFlaggedOccassion> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResFlaggedOccassion>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResFlaggedOccassion> search( Map<String, Object> criteria )
	{
		return super.search( ResFlaggedOccassion.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResFlaggedOccassion.class);
	}

	public List<ResFlaggedOccassion> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResFlaggedOccassion.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResFlaggedOccassion> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResFlaggedOccassion.class , startPage , pageSize);
	}

}
