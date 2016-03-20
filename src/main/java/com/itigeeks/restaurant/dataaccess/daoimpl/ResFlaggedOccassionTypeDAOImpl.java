package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResFlaggedOccassionType;
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
	
	
	public List<ResFlaggedOccassionType> search( Map<String, Object> criteria )
	{
		return super.search( ResFlaggedOccassionType.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResFlaggedOccassionType.class);
	}
}
