package com.itigeeks.restaurant.dataaccess.daoimpl;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itigeeks.restaurant.common.entity.schema.ResTable;
import com.itigeeks.restaurant.dataaccess.dao.ResTableDAO;

/**
 * 
 * 
 * @author ITI GEEKS
 *
 */
@Repository
public class ResTableDAOImpl extends AbstractDAO implements ResTableDAO  , Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public void delete(ResTable resTable) 
	{
		super.delete(resTable);
	}
	
	public ResTable saveOrUpdate(ResTable resTable) 
	{
		return (ResTable) super.saveOrUpdate(resTable);
	}

	public ResTable load(Long id )
	{
		return (ResTable) super.get(ResTable.class , id);
	}

	
	public List<ResTable> loadAll()
	{
		return (List<ResTable>) super.loadAll(ResTable.class);
	}


	public List<ResTable> loadByNamedQuery(String queryName)
	{
		
		return (List<ResTable>) super.loadByNamedQuery(queryName);
	}

	
	public List<ResTable> loadByNamedQuery(String queryName, Map<String, Object> queryParameters)
	{
		return (List<ResTable>) super.loadByNamedQuery( queryName, queryParameters);
	}
	
	
	public List<ResTable> search( Map<String, Object> criteria )
	{
		return super.search( ResTable.class  , criteria);
	}

	
	public Integer countAll()
	{
		return super.countAll(ResTable.class);
	}

	public List<ResTable> search( Map<String, Object> criteria , Integer firstPage , Integer pageSize ) 
	{
		return super.search( ResTable.class , criteria ,  firstPage ,  pageSize ); 
	}

	public List<ResTable> loadAll(Integer startPage , Integer pageSize )
	{
		return super.loadAll( ResTable.class , startPage , pageSize);
	}

}
